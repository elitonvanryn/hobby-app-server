package com.vrsistemas.hobbyapp.server.domain.enums;

public enum CardBrand {

	VISA(1, "VISA"),
	MASTERCARD(2, "MASTERCARD"),
	ELO(3, "ELO"),
	HIPERCARD(4, "HIPERCARD"),
	AMEX(5, "AMEX");
	
	private Integer id;
	private String brand;
	
	private CardBrand(Integer id, String brand) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.brand = brand;
	}
}
