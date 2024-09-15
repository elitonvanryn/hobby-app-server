package com.vrsistemas.hobbyapp.server.domain;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer id;
	protected String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	public UserApp userApp;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserApp getUserApp() {
		return userApp;
	}

	public void setUserApp(UserApp userApp) {
		this.userApp = userApp;
	}
	
}
