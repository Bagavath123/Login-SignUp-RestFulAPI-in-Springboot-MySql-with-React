package com.example.lohiajute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class Lohiajute1Application {

	public static void main(String[] args) {
		SpringApplication.run(Lohiajute1Application.class, args);
	}

}
