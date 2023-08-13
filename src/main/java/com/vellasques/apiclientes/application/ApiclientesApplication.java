package com.vellasques.apiclientes.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;

@SpringBootApplication(exclude = FlywayAutoConfiguration.class)
public class ApiclientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiclientesApplication.class, args);
	}

}
