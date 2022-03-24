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

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.abdullahteke.swcaintegration.controller.SqlDbManager;
import com.abdullahteke.swcaintegration.domain.Ticket;
import com.abdullahteke.swcaintegration.domain.UNQueueRecord;

/**
 * @author <a href="http://www.christianposta.com/blog">Christian Posta</a>
 */
public class HandleTicketOnQueue {

    private static final String BROKER_URL = "tcp://172.18.63.203:61616";
    //private static final String BROKER_URL = "tcp://localhost:61616";
    private static final Boolean NON_TRANSACTED = false;
    private static final Logger logger = (Logger) LogManager.getLogger(HandleTicketOnQueue.class);
    
    public static void main(String[] args) {
        String url = BROKER_URL;
        if (args.length > 0) {
            url = args[0].trim();
        }
      
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("admin", "admin", url);
        connectionFactory.setTrustAllPackages(true);
        Connection connection = null;

        try {

            connection = connectionFactory.createConnection();
            connection.start();

            Session session = connection.createSession(NON_TRANSACTED, Session.AUTO_ACKNOWLEDGE);
            Destination destination = session.createQueue("TicketQueue");
            MessageConsumer consumer = session.createConsumer(destination);

            Ticket t = null;


            while (true) {
                Message message = consumer.receiveNoWait();
                

                if (message != null) {
                    if (message instanceof ObjectMessage) {
                    	
                    	t= (Ticket) ((ObjectMessage) message).getObject();
                    	logger.log(Level.INFO, "Oldu");
                    	//logger.log(Level.INFO, t.getTemosNo()+" temos NO"+t.getIpAddress()+" ip adresi "+t.getTicketStatus()+" işlemi yapıldı");
                    	/*
                    	UNQueueRecord env=new UNQueueRecord();
                    	env.setBirimID(t.getPrm_birimID());
                    	env.setzODYA_Devre_Numara(t.getPrm_zODYA_Devre_Numara());
                    	env.setzODYA_Kurum_Tipi(SqlDbManager.getInstance().getzODYA_Kurum_TipiID(t.getPrm_zODYA_Kurum_Tipi()));
                        env.setVpn_Bulut_Adi(SqlDbManager.getInstance().getvpn_Bulut_AdiID(t.getPrm_vpn_Bulut_Adi()));
                        env.setSehir(SqlDbManager.getsehirID(t.getPrm_sehir()));
                        env.setLokasyon_tipi(t.getPrm_lokasyonTipi());
                        env.setProcess(t.getPrm_process());
                        env.setPriority(SqlDbManager.getInstance().getPriorty(t.getPrm_lokasyonTipi()));
                        env.setCustomer(SqlDbManager.getInstance().getCustomer(env.getSehir(), env.getVpn_Bulut_Adi()));
                        env.setIp_address(t.getPrm_ip_address());
                        env.setCategory(SqlDbManager.getInstance().getCategory(env.getPriority(), env.getIp_address()));
                        env.setzODYA_Lokasyon(SqlDbManager.getInstance().getLokasyon(env.getBirimID()));
                        env.setEnvanterUUID("cnt:DA7F1F18683E374E8777632C3E1AD513");
                        env.setGroup("cnt:C771D080A8C5B34892979BAD7D40E12C");
                        env.setReportedBy("");
                        */
                        
                    }
                } 
            }
        
        } catch (Exception e) {
        	e.printStackTrace();
        	logger.log(Level.FATAL, "Oldu");
            System.out.println("Caught exception!");
        }
        finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (JMSException e) {
                    System.out.println("Could not close an open connection...");
                }
            }
        }
    }
}