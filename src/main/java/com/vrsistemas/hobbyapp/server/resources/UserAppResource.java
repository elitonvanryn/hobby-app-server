package com.vrsistemas.hobbyapp.server.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.vrsistemas.hobbyapp.server.domain.UserApp;
import com.vrsistemas.hobbyapp.server.dto.UserAppNewDTO;
import com.vrsistemas.hobbyapp.server.services.UserAppService;

@RestController
@RequestMapping(value = "/users")
public class UserAppResource {

	@Autowired
	private UserAppService userAppService;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody UserAppNewDTO objDto){
		UserApp obj = userAppService.fromDTO(objDto);
		obj = userAppService.insert(obj);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
}
