package com.uberclone.core.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class UserServiceApplication {

	public static void main(String[] args) {
		//need to add the hibernate erro skip code
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
