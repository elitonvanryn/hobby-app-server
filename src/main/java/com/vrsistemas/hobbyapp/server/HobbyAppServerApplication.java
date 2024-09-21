package com.vrsistemas.hobbyapp.server;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vrsistemas.hobbyapp.server.services.PaymentOrderService;

@SpringBootApplication
public class HobbyAppServerApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(HobbyAppServerApplication.class, args);
	}

}
