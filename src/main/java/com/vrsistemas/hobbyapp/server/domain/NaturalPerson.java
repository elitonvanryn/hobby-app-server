package com.vrsistemas.hobbyapp.server.domain;

import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.persistence.Entity;

@Entity
@JsonTypeName("natural_person")
public class NaturalPerson extends Person {

	private String surname;
	
}
