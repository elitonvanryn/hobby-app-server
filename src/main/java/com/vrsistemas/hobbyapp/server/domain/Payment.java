package com.vrsistemas.hobbyapp.server.domain;

import java.io.Serializable;

public class Payment implements Serializable {
	private static final long serialVersionUID = 1L;

	protected Integer id;
	
	protected Order order;
}
