package com.vrsistemas.hobbyapp.server.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAlias;

public class NaturalPersonDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String surname;
	private Integer userId;
	
	public NaturalPersonDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@JsonAlias("user-id")
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
