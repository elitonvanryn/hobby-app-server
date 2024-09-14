package com.vrsistemas.hobbyapp.server.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class AbstractEmailService implements EmailService {

	@Value("${default.sender}")
	private String sender;
	
	@Override
	public void sendUserToken(String token) {
		SimpleMailMessage sm = prepareTokenEmail(token);
		sendEmail(sm);
	}
	
	protected SimpleMailMessage prepareTokenEmail(String token) {
		SimpleMailMessage sm = new SimpleMailMessage();
		sm.setTo("elitonvanryn@gmail.com");
		sm.setFrom(sender);
		sm.setSubject("Seu código de confirmação");
		sm.setSentDate(new Date(System.currentTimeMillis()));
		sm.setText("Usuário criado com sucesso, seu token: " + token);
		return sm;
	}

	@Override
	public void sendEmail(SimpleMailMessage msg) {
		// TODO Auto-generated method stub
		
	}

}
