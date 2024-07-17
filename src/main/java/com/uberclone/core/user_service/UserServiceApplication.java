package com.uberclone.core.user_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {
		//need to add the hibernate erro skip code
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
