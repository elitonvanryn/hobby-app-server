package com.vrsistemas.hobbyapp.server.domain;

import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.persistence.Entity;

@Entity
@JsonTypeName("natural_person")
public class NaturalPerson extends Person {

	private String surname;
	
	public NaturalPerson() {
		// TODO Auto-generated constructor stub
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
}
