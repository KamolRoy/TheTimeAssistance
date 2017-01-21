package com.comolroy.timesupport.MailService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * Mock Mail Service to check mail in logging system
 */
public class MockMailSender implements MailSender{

	private static final Log log = LogFactory.getLog(MockMailSender.class);
	
	@Override
	public void send(String to, String subject, String body) {
		// TODO Auto-generated method stub
		log.info("Sending Mock mail to " + to) ;
		log.info("Subject:  " + subject) ;
		log.info("Body: " + body) ;
	}

}
