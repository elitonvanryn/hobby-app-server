package com.vrsistemas.hobbyapp.server.dto;

import java.io.Serializable;

public class CredencialsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String email;
	private String password;
	
	public CredencialsDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
