package com.vrsistemas.hobbyapp.server.domain;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ItemSeller implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer price;
	
	private Integer stock;
	
	private Date publicationDate;
	
	@ManyToOne
	@JoinColumn(name = "item_id")
	private Item item;
	
	@ManyToOne
	@JoinColumn(name = "seller_id")
	public Person seller;

}
