package com.comolroy.timesupport.MailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;

@Configuration
public class MailConfig {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Bean
	@ConditionalOnProperty(name="spring.mail.host",
			havingValue="mock",
			matchIfMissing=true)
	public MailSender mockMailSender(){
		return new MockMailSender();
	}
	
	@Bean
	@ConditionalOnProperty(name="spring.mail.host",
			havingValue = "smtp.gmail.com")
	public MailSender smtpMailSender(){
		SmtpMailSender mailSender = new SmtpMailSender();
		mailSender.setJavaMailSender(javaMailSender);
		return mailSender;
	}
}
