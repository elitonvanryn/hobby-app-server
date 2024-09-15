package com.vrsistemas.hobbyapp.server.services.thread;

import org.springframework.beans.factory.annotation.Autowired;

import com.vrsistemas.hobbyapp.server.services.UserAppService;

public class SendMailThread implements Runnable {

	@Autowired
	private UserAppService userAppService;
	
	@Override
	public void run() {
		
		
		
	}
	
}
