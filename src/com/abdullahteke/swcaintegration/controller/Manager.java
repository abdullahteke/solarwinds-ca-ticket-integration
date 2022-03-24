package com.abdullahteke.swcaintegration.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.rmi.RemoteException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.axis2.AxisFault;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.abdullahteke.swcaintegration.domain.UNQueueRecord;
import com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub;
import com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.ArrayOfString;
import com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.CloseTicket;
import com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.CloseTicketResponse;
import com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.CreateRequest;
import com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.CreateRequestResponse;
import com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.DoSelect;
import com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.DoSelectResponse;
import com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.Login;
import com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.LoginResponse;

import io.netty.util.ResourceLeakTracker;

public class Manager {
	
	private static Manager managerInstance;
	private static USD_WebServiceStub stub;
    private static final Logger logger = (Logger) LogManager.getLogger(Manager.class);

	
	public static Manager getManagerInstance() {
		
		if (managerInstance==null){
			managerInstance=new Manager();
		}
		return managerInstance;
	}

	private Manager(){
		try {
			//stub = new USD_WebServiceStub("http://172.18.63.214:8080/axis/services/USD_R11_WebService");
			stub = new USD_WebServiceStub("http://172.18.63.202:8080/axis/services/USD_R11_WebService?wsdl");
		} catch (AxisFault e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public int getSID() {
		int retVal=-1;
		
		Login login=new Login();
		//login.setUsername("servicedesk");
		//login.setPassword("Asdf1234");
		login.setUsername("admin");
		login.setPassword("!Z1eMeca");
		LoginResponse resp = null;
		
		try {
			resp = stub.login(login);
		} catch (RemoteException e) {
			logger.error("HATA:"+e.getMessage());
			e.printStackTrace();
		}
		retVal=resp.getLoginReturn();
		return retVal;
	}
	
	public String getCallReq(String temosNo) {
		String retVal="";
		
		DoSelectResponse response = null;
		DoSelect req= new DoSelect();
		ArrayOfString param= new ArrayOfString();
		param.addString("ref_num");
		param.addString("zODYA_Ariza_TemosNo");
		
		req.setSid(getSID());
		req.setObjectType("cr");
		req.setWhereClause("type='I' and status='OP' and customer.first_name='solarwinds' and zODYA_Ariza_TemosNo='"+temosNo+"'");
		req.setMaxRows(10);
		req.setAttributes(param);
		
		
		try {
			response =stub.doSelect(req);
		} catch (RemoteException e) {
			logger.error("HATA:"+e.getMessage());
			e.printStackTrace();
		}
		
		retVal=getReqIDFromXML(response.getDoSelectReturn());

		
		return retVal;
	}
	
	public String getReqIDFromXML(String xmlString) {
		
		String retVal=null;
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = null;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			logger.error("HATA:"+e.getMessage());
			e.printStackTrace();
		}
		InputStream inputStream = new ByteArrayInputStream(xmlString.getBytes());
		try {
			Document doc= dBuilder.parse(inputStream);
			doc.getDocumentElement().normalize();
			
			NodeList crList=doc.getElementsByTagName("Handle");

			if (crList.item(0)!=null) {
				retVal=crList.item(0).getTextContent();
			}else if (crList.getLength()>1){
				logger.error("HATA: Bu Temos Numarası İçin Birden Fazla Ticket Var");
			}else {
				logger.error("HATA: Ticket Bulunamadı");
			}
		
		} catch (SAXException e) {
			logger.error("HATA:"+e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			logger.error("HATA:"+e.getMessage());
			e.printStackTrace();
		}
		return retVal;
	}

	public void closeTicket(String reqID) {
		CloseTicketResponse resp = null;
		CloseTicket req=new CloseTicket();
		req.setTicketHandle(reqID);
		req.setSid(getSID());
		req.setDescription("Test");
		
		try {
			resp=stub.closeTicket(req);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(resp.getCloseTicketReturn());
	}
	
	public void createTicket(String reqID) {
		CreateRequestResponse resp = null;
		CreateRequest req=new CreateRequest();
		
		req.setSid(getSID());
		
		ArrayOfString attributes= new ArrayOfString();
		attributes.addString("");
		req.setAttributes(attributes);
		
		ArrayOfString attributeValues=new ArrayOfString();
		attributeValues.addString("");
		req.setAttrVals(attributeValues);
		
		ArrayOfString propertyValues= new ArrayOfString();
		propertyValues.addString("");
		req.setPropertyValues(propertyValues);
		
		req.setCreatorHandle("");
		req.setNewRequestNumber("");
		req.setNewRequestHandle("");
		req.setTemplate("");

		
		try {
			resp=stub.createRequest(req);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(resp.getCreateRequestReturn());
	}
	
	public List<UNQueueRecord> getUcNoktaListesi(int process){
		List<UNQueueRecord> retVal=new ArrayList<UNQueueRecord>();
		ResultSet res;
		UNQueueRecord qr = null;
		
		try {
			res=SqlDbManager.getInstance().getUNTicket(process);
			while(res.next()) {
				qr.setBirimID(res.getString("birimID"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return retVal;
	}

} // end of Manager Class
