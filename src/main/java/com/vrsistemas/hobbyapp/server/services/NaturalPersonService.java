package com.vrsistemas.hobbyapp.server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrsistemas.hobbyapp.server.domain.NaturalPerson;
import com.vrsistemas.hobbyapp.server.domain.enums.PersonType;
import com.vrsistemas.hobbyapp.server.dto.NaturalPersonDTO;
import com.vrsistemas.hobbyapp.server.repositories.NaturalPersonRepository;

@Service
public class NaturalPersonService {

	@Autowired
	private NaturalPersonRepository naturalPersonRepository;
	
	@Autowired
	private UserAppService userAppService;
	
	public NaturalPerson insert(NaturalPerson naturalPersonObj) {
		naturalPersonObj.setId(null);
		
		naturalPersonObj = naturalPersonRepository.save(naturalPersonObj);
		
		return naturalPersonObj;
	}
	
	public NaturalPerson fromDTO(NaturalPersonDTO objDTO) {
		NaturalPerson obj = new NaturalPerson();
		obj.setId(null);
		obj.setName(objDTO.getName());
		obj.setPersonType(PersonType.NATURAL_PERSON);
		obj.setSurname(objDTO.getSurname());
		obj.setUserApp(userAppService.find(objDTO.getUserId()));
		
		return obj;
	}
	
}
