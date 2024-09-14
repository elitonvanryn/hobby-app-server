package com.vrsistemas.hobbyapp.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vrsistemas.hobbyapp.server.services.EmailService;
import com.vrsistemas.hobbyapp.server.services.SmtpEmailService;

@Configuration
public class Config {

	@Bean
	EmailService emailService() {
		return new SmtpEmailService();
	}
	
}
