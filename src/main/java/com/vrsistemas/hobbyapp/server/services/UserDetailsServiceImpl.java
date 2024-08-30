package com.vrsistemas.hobbyapp.server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vrsistemas.hobbyapp.server.domain.UserApp;
import com.vrsistemas.hobbyapp.server.repositories.UserAppRepository;
import com.vrsistemas.hobbyapp.server.security.UserSS;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserAppRepository userAppRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		UserApp userApp = userAppRepository.findByEmail(email);
		if (userApp == null) {
			throw new UsernameNotFoundException(email);
		}
		return new UserSS(userApp.getId(), userApp.getEmail(), userApp.getPassword());
	}
	
}
