package com.vrsistemas.hobbyapp.server.services;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class DateTimeService {

	public Date getCurrentDateTime() {
		return new Date();
	}
	
}
