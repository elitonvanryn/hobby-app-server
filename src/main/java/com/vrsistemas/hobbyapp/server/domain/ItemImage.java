package com.vrsistemas.hobbyapp.server.domain;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class ItemImage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String urlImage;
	
	private Date uploadDate;
	
	private Integer order;
	
	@ManyToOne
	private Item item;
	
	public ItemImage() {
		// TODO Auto-generated constructor stub
	}
	
	
}
