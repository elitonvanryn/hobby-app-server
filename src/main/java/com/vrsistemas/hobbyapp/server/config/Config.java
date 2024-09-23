package com.vrsistemas.hobbyapp.server.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vrsistemas.hobbyapp.server.services.DBService;
import com.vrsistemas.hobbyapp.server.services.EmailService;
import com.vrsistemas.hobbyapp.server.services.SmtpEmailService;

import jakarta.mail.internet.ParseException;

@Configuration
public class Config {

	@Autowired
	private DBService dbService;
	
	@Bean
	public boolean instantiateDatabase() throws ParseException {
		dbService.instantiateTestDatabase();
		return true;
	}
	
	@Bean
	EmailService emailService() {
		return new SmtpEmailService();
	}
	
}
