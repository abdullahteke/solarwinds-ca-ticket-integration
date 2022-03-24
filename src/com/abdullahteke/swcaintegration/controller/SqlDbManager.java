package com.abdullahteke.swcaintegration.controller;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.abdullahteke.swcaintegration.main.CreateOrDeleteTicket;

public class SqlDbManager {
	public static SqlDbManager managerInstance;
	private DataSource dataSource;
    private Connection connection;
    private static final Logger logger = (Logger) LogManager.getLogger(CreateOrDeleteTicket.class);

	
	public static SqlDbManager getInstance(){
		if (managerInstance==null){
			
			
			try {
				
				managerInstance=new SqlDbManager();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		return managerInstance;
	}
	
	public SqlDbManager() throws SQLException {

		if ( dataSource == null ) {

			final BasicDataSource ds= new BasicDataSource();
			ds.setDriverClassName("net.sourceforge.jtds.jdbc.Driver");
			ds.setUsername("servicedesk");
			ds.setPassword("Asdf1234");
			//ds.setUrl("jdbc:jtds:sqlserver://172.18.63.202/mdb");
			ds.setUrl("jdbc:jtds:sqlserver://172.18.63.214/mdb");
			ds.setValidationQuery("select 1");
			
			dataSource=ds;
		}
		
		if (connection==null){
			connection= dataSource.getConnection();
		}
	}
	
	/*
	public SqlDbManager() throws SQLException {
		
		if ( dataSource == null ) { 
			//DataSource ds = null;
			
			try {
				InitialContext cxt=new InitialContext();
				
				dataSource = (DataSource) cxt.lookup( "java:/comp/env/jdbc/sgmSqlConnection" );

			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		if (connection==null){
			connection= dataSource.getConnection();
		}
	}

*/

	public ResultSet executeQuery(String query) throws SQLException{
		ResultSet retVal=null;
		
		retVal=connection.createStatement().executeQuery(query);
		
		
		return retVal;
	}

	public ResultSet getUNTicket(int process){
		ResultSet retVal=null;
		String query="";
		if (process==0) {
			query="select "
				+ "z.*, "
				+ "CONVERT(INT, n.UnManaged) UnManaged, "
				+ "n.IP_Address, "
				+ "cl.location_name locName, "
				+ "'loc:' + mdb.dbo.hex(cl.location_uuid) locUUID, "
				+ "cl.zODYA_TemosNo locTemosNo, "
				+ "cl.state AS locKurumTipi "
				+ "FROM mdb.dbo.zODYA_TicketIntegration_UcNokta z "
				+ "inner join mdb.dbo.ca_location cl on cl.zODYA_Birim_Kodu_ID = z.BirimKodu "
				+ "inner join [172.18.250.38].SolarWindsOrion.dbo.Nodes n on n.Birim_Kodu = cl.zODYA_Birim_Kodu_ID "
				+ "and n.lokasyon_tipi = 'Uc_Nokta' WHERE z.process = 0 "
				+ "and mdb.dbo.F_DATETIME_TO_UNIX_TIME(GETDATE()) - insertedTime >= (10 * 60) ORDER BY z.insertedTime"; 
		}else {
			query="select z.*, "
					+ "n.IP_Address, "
					+ "'loc:' + mdb.dbo.hex(cl.location_uuid) locUUID, "
					+ "cl.zODYA_TemosNo locTemosNo, "
					+ "cl.state AS locKurumTipi, "
					+ "(select top 1 'cnt:' + mdb.dbo.hex(contact_uuid) "
					+ "		from mdb.dbo.usp_contact "
					+ "		where zODYA_site = cl.site_id and zODYA_country = cl.country) as locCustomer "
					+ "FROM mdb.dbo.zODYA_TicketIntegration_UcNokta z "
					+ "inner join mdb.dbo.ca_location cl on cl.zODYA_Birim_Kodu_ID = z.BirimKodu "
					+ "inner join [172.18.250.38].SolarWindsOrion.dbo.Nodes n on n.Birim_Kodu = cl.zODYA_Birim_Kodu_ID and n.lokasyon_tipi = 'Uc_Nokta' "
					+ "WHERE z.process = 2 ORDER BY z.insertedTime"; 
					
		}
		
		try {
			retVal = executeQuery(query);
			logger.info("Tİcket Açılacak Uç Noktaların Listesi");

		} catch (SQLException e) {
			logger.info("Ticket Açılacak Uç Noktaların Listesi Alınırken Hata Alındı");
		}
		
		return retVal;
	}
	
}