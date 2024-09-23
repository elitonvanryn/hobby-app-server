package com.vrsistemas.hobbyapp.server.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrsistemas.hobbyapp.server.domain.Item;
import com.vrsistemas.hobbyapp.server.repositories.ItemImageRepository;
import com.vrsistemas.hobbyapp.server.repositories.ItemRepository;

import jakarta.mail.internet.ParseException;

@Service
public class DBService {

	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	private ItemImageRepository itemImageRepository;
	
	public void instantiateTestDatabase() throws ParseException {
		
		Item item001 = new Item(null, "Carrinho Hot Wheels Premium The Super Mario Bros Movie");
		itemRepository.saveAll(Arrays.asList(item001));
		
	}
	
}
