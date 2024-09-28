package com.vrsistemas.hobbyapp.server.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.vrsistemas.hobbyapp.server.domain.LegalPerson;
import com.vrsistemas.hobbyapp.server.domain.NaturalPerson;
import com.vrsistemas.hobbyapp.server.domain.UserApp;
import com.vrsistemas.hobbyapp.server.dto.LegalPersonDTO;
import com.vrsistemas.hobbyapp.server.dto.NaturalPersonDTO;
import com.vrsistemas.hobbyapp.server.dto.UserAppNewDTO;
import com.vrsistemas.hobbyapp.server.services.LegalPersonService;
import com.vrsistemas.hobbyapp.server.services.NaturalPersonService;

@RestController
@RequestMapping(value = "/person")
public class PersonResource {
	
	@Autowired
	private LegalPersonService legalPersonService;
	
	@Autowired
	private NaturalPersonService naturalPersonService;
	
	@PostMapping(value = "/legal-person")
	public ResponseEntity<Void> insert(@RequestBody LegalPersonDTO objDto){
		LegalPerson obj = legalPersonService.fromDTO(objDto);
		obj = legalPersonService.insert(obj);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	@PostMapping(value = "/natural-person")
	public ResponseEntity<Void> insert(@RequestBody NaturalPersonDTO objDto){
		NaturalPerson obj = naturalPersonService.fromDTO(objDto);
		obj = naturalPersonService.insert(obj);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
}
