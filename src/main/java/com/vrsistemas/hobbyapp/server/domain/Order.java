package com.vrsistemas.hobbyapp.server.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private Date orderDate;
	
	private List<ItemOrder> items;
	
	private Shipping shipping;
	
	private UserApp userApp;
	
}
