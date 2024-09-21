package com.vrsistemas.hobbyapp.server.domain;

import jakarta.persistence.Entity;

@Entity
public class ItemCart {

	private ItemSeller itemSeller;
	
	private Integer shippingCost;
	
}
