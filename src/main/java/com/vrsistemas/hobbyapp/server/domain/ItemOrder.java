package com.vrsistemas.hobbyapp.server.domain;

import java.io.Serializable;

public class ItemOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	private ItemSeller itemSeller;
	
	private Integer price;
	
	private Integer shippingCost;
}
