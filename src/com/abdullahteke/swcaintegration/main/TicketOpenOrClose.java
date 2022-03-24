package com.abdullahteke.swcaintegration.main;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.abdullahteke.swcaintegration.domain.Ticket;

public class TicketOpenOrClose {
    private static final String BROKER_URL = "tcp://localhost:61616";
    //private static final String BROKER_URL = "tcp://172.18.63.203:61616";
    
    private static final Logger logger = (Logger) LogManager.getLogger(TicketOpenOrClose.class);

    private static final Boolean NON_TRANSACTED = false;
    private static final long DELAY = 100;
    
	public static void main(String[] args) {
		
		Ticket t= new Ticket();
		t.setPrm_process(args[0].toString().trim());
		t.setPrm_zODYA_Devre_Numara(args[1].toString().trim());
		t.setPrm_zODYA_Kurum_Tipi(args[2].toString().trim());
		t.setPrm_vpn_Bulut_Adi(args[3].toString().trim());
		t.setPrm_sehir(args[4].toString().trim());
		t.setPrm_lokasyonTipi(args[5].toString().trim());
		t.setPrm_birimID(args[6].toString().trim());
		t.setPrm_ip_address(args[7].toString().trim());
		
		String url = BROKER_URL;
	    ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("admin", "admin", url);
	    connectionFactory.setTrustAllPackages(true);
	    Connection connection = null;
	       
        try {

            connection = connectionFactory.createConnection();
            connection.start();

            Session session = connection.createSession(NON_TRANSACTED, Session.AUTO_ACKNOWLEDGE);
            
            
            Destination destination = session.createQueue("TicketQueue");
           
            MessageProducer producer = session.createProducer(destination);
       	
            ObjectMessage message=session.createObjectMessage();
                

            message.setObject(t);
            producer.send(message);
        
            Thread.sleep(DELAY);
            
            producer.close();
            session.close();    
        }catch (Exception e) {
		// TODO: handle exception
        }
        finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (JMSException e) {
                	e.printStackTrace();
                    System.out.println("Could not close an open connection...");
                   logger.log(Level.FATAL, e.getMessage());
                    logger.log(Level.FATAL, "Connection kapatılamadı");
                    
                }
            }
        }
	}
}
