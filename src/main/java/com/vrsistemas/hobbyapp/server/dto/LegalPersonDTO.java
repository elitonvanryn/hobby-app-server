package com.vrsistemas.hobbyapp.server.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAlias;

public class LegalPersonDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String federalRegistration;
	private Integer userId;
	
	public LegalPersonDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonAlias("federal-registration")
	public String getFederalRegistration() {
		return federalRegistration;
	}

	public void setFederalRegistration(String federalRegistration) {
		this.federalRegistration = federalRegistration;
	}

	@JsonAlias("user-id")
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
