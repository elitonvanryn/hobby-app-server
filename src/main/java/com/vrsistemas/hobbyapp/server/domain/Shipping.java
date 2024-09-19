package com.vrsistemas.hobbyapp.server.domain;

import java.io.Serializable;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Shipping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
	public String address;
	public String number;
	public Boolean noNumber;
	public String neighborhood;
	public String complement;
	public String postalCode;
}
