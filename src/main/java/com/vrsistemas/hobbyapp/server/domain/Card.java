package com.vrsistemas.hobbyapp.server.domain;

import java.io.Serializable;

import com.vrsistemas.hobbyapp.server.domain.enums.CardBrand;

public class Card implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String lastFourDigits;
	private Integer expirationMonth;
	private Integer expirationYear;
	
	private CardBrand brand;
	
	private String token;
}
