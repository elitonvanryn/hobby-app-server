package com.vrsistemas.hobbyapp.server.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

public class AbstractEmailService implements EmailService {

	@Value("${default.sender}")
	private String sender;
	
	@Override
	public void sendEmail(SimpleMailMessage msg) {
		SimpleMailMessage sm = new SimpleMailMessage();
		sm.setTo("elitonvanryn@gmail.com");
		sm.setFrom(sender);
		sm.setSubject("Pedido confirmado! Código: ");
		sm.setSentDate(new Date(System.currentTimeMillis()));
		sm.setText("<h1>Pedido confirmado</h1>");
		
	}

}
