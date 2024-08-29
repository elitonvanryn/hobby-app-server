package com.vrsistemas.hobbyapp.server.services;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class UserAppService {

	
	
	public void generateToken() {
		
		DateTimeService dateTimeService = new DateTimeService();
		
		Random rand = new Random();
		StringBuilder builder = new StringBuilder();
		
		for(int i = 0; i < 6; i++) {
			builder.append(rand.nextInt(9));
		}
	}
	
}
