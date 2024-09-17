package com.vrsistemas.hobbyapp.server.domain.enums;

public enum PaymentStatus {

	WAITING(1, "WAITING");
	
	private Integer id;
	private String status;
	
	private PaymentStatus(Integer id, String status) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.status = status;
	}
	
}
