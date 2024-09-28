package com.vrsistemas.hobbyapp.server.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.persistence.Entity;

@Entity
@JsonTypeName("legal_person")
public class LegalPerson extends Person {
	private static final long serialVersionUID = 1L;

	private String federalRegistration;
	
	public LegalPerson() {
		// TODO Auto-generated constructor stub
	}

	public LegalPerson(Integer id, String name, List<Address> address, String personType, UserApp userApp, String federalRegistration) {
		super(id, name, address, personType, userApp);
		// TODO Auto-generated constructor stub
		this.federalRegistration = federalRegistration;
	}

	public String getFederalRegistration() {
		return federalRegistration;
	}

	public void setFederalRegistration(String federalRegistration) {
		this.federalRegistration = federalRegistration;
	}
	
}
