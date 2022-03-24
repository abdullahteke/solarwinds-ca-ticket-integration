package com.abdullahteke.swcaintegration.main;

import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.axis2.AxisFault;

import com.abdullahteke.swcaintegration.controller.Manager;
import com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub;
import com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.ArrayOfString;
import com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.CreateRequest;
import com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.CreateRequestResponse;
import com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.DoQuery;
import com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.DoQueryResponse;
import com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.DoSelect;
import com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.DoSelectResponse;
import com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.ListResult;
import com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.Login;
import com.ca.www.unicenterserviceplus.servicedesk.USD_WebServiceStub.LoginResponse;

public class Test {

	public static void main(String[] args) throws RemoteException {
		
		String st="<?xml version=\"1.0\" encoding=\"UTF-8\"?><UDSObjectList>\r\n" + 
				"<UDSObject>\r\n" + 
				"<Handle>cr:511928</Handle>\r\n" + 
				"<Attributes>\r\n" + 
				"<Attribute DataType=\"2002\">\r\n" + 
				"<AttrName>ref_num</AttrName>\r\n" + 
				"<AttrValue>104301</AttrValue>\r\n" + 
				"</Attribute>\r\n" + 
				"<Attribute DataType=\"2002\">\r\n" + 
				"<AttrName>zODYA_Ariza_TemosNo</AttrName>\r\n" + 
				"<AttrValue>140000000178377</AttrValue>\r\n" + 
				"</Attribute>\r\n" + 
				"</Attributes>\r\n" + 
				"</UDSObject>\r\n" + 
				"</UDSObjectList>\r\n";
		String st2="<?xml version=\"1.0\" encoding=\"UTF-8\"?><UDSObjectList/>";
		//Manager.getManagerInstance().getReqNumber(st);
		//Manager.getManagerInstance().getReqNumber(st2);
		String temosNo="140000000244784";
		String st1= Manager.getManagerInstance().getCallReq(temosNo);
		System.out.println("RequestID:"+st1);
	}	
}
