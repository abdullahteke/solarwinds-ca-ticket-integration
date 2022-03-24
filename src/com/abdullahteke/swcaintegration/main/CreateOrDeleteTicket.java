/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.abdullahteke.swcaintegration.main;

import java.util.Enumeration;
import java.util.concurrent.TimeUnit;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.QueueBrowser;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.abdullahteke.swcaintegration.domain.Ticket;

/**
 * @author <a href="http://www.christianposta.com/blog">Christian Posta</a>
 */
public class CreateOrDeleteTicket {
    private static final String BROKER_URL = "tcp://172.18.63.203:61616";
    //private static final String BROKER_URL = "tcp://localhost:61616";
    
    private static final Logger logger = (Logger) LogManager.getLogger(CreateOrDeleteTicket.class);

    private static final Boolean NON_TRANSACTED = false;
    private static final long DELAY = 100;

    public static void main(String[] args) {
    	
        String url = BROKER_URL;
        /*
        if (args.length > 0) {
            url = args[0].trim();
        }*/
        
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("admin", "admin", url);
        connectionFactory.setTrustAllPackages(true);
        Connection connection = null;
        
        Ticket t=new Ticket();
        t.setPrm_birimID("23rwrw");
        
        String temosNo= args[0];
        String ipAddrs=args[1];
        String status=args[2];
        logger.log(Level.INFO, "test");
        
        try {

            connection = connectionFactory.createConnection();
            connection.start();

            Session session = connection.createSession(NON_TRANSACTED, Session.AUTO_ACKNOWLEDGE);
            
            
            Destination destination = session.createQueue("TicketQueue");
           
            MessageProducer producer = session.createProducer(destination);
            
            if (!isTicketExist(destination,session,t)) {
            	
                ObjectMessage message=session.createObjectMessage();
                

                message.setObject(t);
                producer.send(message);
            }else {
            	logger.error("This Ticket Is Already In The Queue");
            }

                        

            
           //logger.log(Level.INFO,t.getTemosNo()+" temos Numaralı devre,"+t.getIpAddress()+" devre"+t.getTicketStatus());
           //logger.info(t.getTemosNo()+" temos Numaralı devre,"+t.getIpAddress()+" devre"+t.getTicketStatus());
            Thread.sleep(DELAY);
            
            producer.close();
            session.close();

        } catch (Exception e) {
        	e.printStackTrace();
        	//logger.log(Level.ERROR,t.getTemosNo()+" temos Numaralı devre,"+t.getIpAddress()+" devre"+t.getTicketStatus()+" kuyruga atılırken hata alındı");
        	//logger.log(Level.ERROR, e.getMessage());
        	logger.error(e.getMessage());
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

	private static boolean isTicketExist(Destination destination,Session session,Ticket ticket) throws JMSException, InterruptedException {
		boolean retVal=false;
		MessageConsumer consumer;
		Queue queue = session.createQueue("TicketQueue");
        QueueBrowser browser = session.createBrowser(queue);
        Enumeration enumeration = browser.getEnumeration();
        ObjectMessage message;
        Ticket t;
        while (enumeration.hasMoreElements()) {
             message = (ObjectMessage) enumeration.nextElement();
             t=(Ticket) message.getObject();
             if (ticket.equals(t)) {
            	 retVal=true;
             }
             
            TimeUnit.MILLISECONDS.sleep(DELAY);
            
        }
		return retVal;
	}

}