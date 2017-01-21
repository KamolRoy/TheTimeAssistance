package com.comolroy.timesupport.MailService;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

/*
 * SMTP Mail Service, sending real mail to the users
 */
public class SmtpMailSender implements MailSender{

	private static final Log log = LogFactory.getLog(MockMailSender.class);
	private JavaMailSender javaMailSender;
	
	
	public void setJavaMailSender(JavaMailSender javaMailSender) {
		// TODO Auto-generated method stub
		this.javaMailSender = javaMailSender;
	}
	
	@Override
	public void send(String to, String subject, String body) throws MessagingException {
		// TODO Auto-generated method stub
		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper;
		
		helper = new MimeMessageHelper(message,true); // true is to support multiple message
		
		helper.setSubject(subject);
		helper.setTo(to);
		helper.setText(body,true); // true indicate HTML
		
		// helper can also be used for other functionalities like adding attachment ect.
		
		javaMailSender.send(message);
		
		log.info("Sending SMTP mail to " + to) ;
		log.info("Subject:  " + subject) ;
		log.info("Body: " + body) ;
	}

	
}
