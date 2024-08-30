package com.vrsistemas.hobbyapp.server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vrsistemas.hobbyapp.server.domain.UserApp;

@Repository
public interface UserAppRepository extends JpaRepository<UserApp, Integer>{

	UserApp findByEmail(String email);
	
}
