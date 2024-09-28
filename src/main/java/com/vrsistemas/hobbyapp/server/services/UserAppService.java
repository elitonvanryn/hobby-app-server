package com.vrsistemas.hobbyapp.server.services;

import java.time.Duration;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.vrsistemas.hobbyapp.server.domain.UserApp;
import com.vrsistemas.hobbyapp.server.dto.UserAppNewDTO;
import com.vrsistemas.hobbyapp.server.repositories.UserAppRepository;
import com.vrsistemas.hobbyapp.server.services.exceptions.ObjectNotFoundException;

import jakarta.transaction.Transactional;

@Service
public class UserAppService {

	@Autowired
	private UserAppRepository userAppRepository;
	
	@Autowired
	private AbstractEmailService abstractEmailService;
	
	@Autowired
	private DateTimeService dateTimeService;
	
	@Autowired
	private EmailService emailService;
	
	@Autowired
	private BCryptPasswordEncoder pe;
	
	@Transactional
	public UserApp insert(UserApp userAppObj) {
		userAppObj.setId(null);
		
		userAppObj = generateToken(userAppObj);
		
		userAppObj = userAppRepository.save(userAppObj);		
		
		emailService.sendUserToken(userAppObj.getToken());
		
		return userAppObj;
	}
	
	public UserApp find(Integer id) {
		Optional<UserApp> obj = userAppRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + UserApp.class.getName()));
	}
	
	public UserApp findByEmail(String email) {
		return userAppRepository.findByEmail(email);
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
