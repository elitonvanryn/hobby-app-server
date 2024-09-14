package com.vrsistemas.hobbyapp.server.services;

import org.springframework.mail.SimpleMailMessage;

public interface EmailService {

	void sendEmail(SimpleMailMessage msg);
	
	void sendUserToken(String token);
	
}
