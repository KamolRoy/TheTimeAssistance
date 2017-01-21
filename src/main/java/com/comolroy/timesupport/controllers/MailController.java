package com.comolroy.timesupport.controllers;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comolroy.timesupport.MailService.MailSender;

@RestController
public class MailController {


	private MailSender mailSender;

	@Autowired
	public MailController(MailSender mailSender) {
		this.mailSender = mailSender;
	}


	@RequestMapping("/mail")
	public String sendMail() throws MessagingException{
		mailSender.send("comolroy@gmail.com", "Some Subject", "The content");
		return "Mail Sent";
	}
}
