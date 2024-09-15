package com.vrsistemas.hobbyapp.server.domain;

import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.persistence.Entity;

@Entity
@JsonTypeName("natural_person")
public class LegalPerson extends Person {
	private static final long serialVersionUID = 1L;

	public String shopName;
	
}
