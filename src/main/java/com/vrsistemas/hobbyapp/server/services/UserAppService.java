package com.vrsistemas.hobbyapp.server.services;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.vrsistemas.hobbyapp.server.domain.UserApp;
import com.vrsistemas.hobbyapp.server.dto.UserAppNewDTO;
import com.vrsistemas.hobbyapp.server.repositories.UserAppRepository;

import jakarta.transaction.Transactional;

@Service
public class UserAppService {

	@Autowired
	private UserAppRepository userAppRepository;
	
	@Autowired
	private DateTimeService dateTimeService;
	
	@Autowired
	private BCryptPasswordEncoder pe;
	
	@Transactional
	public UserApp insert(UserApp userAppObj) {
		userAppObj.setId(null);
		
		userAppObj = generateToken(userAppObj);
		
		userAppObj = userAppRepository.save(userAppObj);
		
		return userAppObj;
	}
	
	public UserApp generateToken(UserApp userAppObj) {
		
		Random rand = new Random();
		StringBuilder builder = new StringBuilder();
		
		for(int i = 0; i < 6; i++) {
			builder.append(rand.nextInt(9));
		}
		
		userAppObj.setToken(builder.toString());
		userAppObj.setDateOfToken(dateTimeService.getCurrentDateTime());
		userAppObj.setValidated(Boolean.FALSE);
		userAppObj.setDateOfValidation(dateTimeService.getCurrentDateTime());
		
		return userAppObj;
	}
	
	public UserApp fromDTO(UserAppNewDTO objDTO) {
		UserApp obj = new UserApp();
		obj.setId(null);
		obj.setEmail(objDTO.getEmail());
		obj.setPassword(pe.encode(objDTO.getPassword()));
		
		return obj;
	}
	
}
