package com.vrsistemas.hobbyapp.server.domain;

import java.io.Serializable;

public class Card implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String lastFourDigits;
	private Integer expirationMonth;
	private Integer expirationYear;
	
	private String token;
}
