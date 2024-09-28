package com.vrsistemas.hobbyapp.server.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.vrsistemas.hobbyapp.server.domain.enums.PersonType;
import com.vrsistemas.hobbyapp.server.domain.enums.UserProfile;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer id;
	protected String name;
	
	@OneToMany(mappedBy="person", cascade=CascadeType.ALL)
	protected List<Address> address = new ArrayList<>();
	
	protected String personType;
	
	@OneToOne(cascade = CascadeType.ALL)
	protected UserApp userApp;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(Integer id, String name, List<Address> address, String personType, UserApp userApp) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.personType = personType;
		this.userApp = userApp;
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

	public PersonType getPersonType() {
		return PersonType.toEnum(personType);
	}

	public void setPersonType(PersonType personType) {
		this.personType = personType.getType();
	}

	public UserApp getUserApp() {
		return userApp;
	}

	public void setUserApp(UserApp userApp) {
		this.userApp = userApp;
	}
	
}
