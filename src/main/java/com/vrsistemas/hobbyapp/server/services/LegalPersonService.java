package com.vrsistemas.hobbyapp.server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrsistemas.hobbyapp.server.domain.LegalPerson;
import com.vrsistemas.hobbyapp.server.domain.Person;
import com.vrsistemas.hobbyapp.server.domain.enums.PersonType;
import com.vrsistemas.hobbyapp.server.dto.LegalPersonDTO;
import com.vrsistemas.hobbyapp.server.repositories.LegalPersonRepository;

@Service
public class LegalPersonService {

	@Autowired
	private LegalPersonRepository legalPersonRepository;
	
	@Autowired
	private UserAppService userAppService;
	
	public LegalPerson insert(LegalPerson legalPersonObj) {
		legalPersonObj.setId(null);
		
		legalPersonObj = legalPersonRepository.save(legalPersonObj);
		
		return legalPersonObj;
	}
	
	public LegalPerson fromDTO(LegalPersonDTO objDTO) {
		LegalPerson obj = new LegalPerson();
		obj.setId(null);
		obj.setName(objDTO.getName());
		obj.setPersonType(PersonType.LEGAL_PERSON);
		obj.setFederalRegistration(objDTO.getFederalRegistration());
		obj.setUserApp(userAppService.find(objDTO.getUserId()));
		
		return obj;
	}
	
}
