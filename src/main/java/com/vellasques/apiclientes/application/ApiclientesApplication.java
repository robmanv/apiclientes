package com.vellasques.apiclientes.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.vellasques.apiclientes.out.repository")
@EntityScan("com.vellasques.apiclientes.out.entity")
@SpringBootApplication(exclude =
		{FlywayAutoConfiguration.class,
				SecurityAutoConfiguration.class,
				ManagementWebSecurityAutoConfiguration.class},
		scanBasePackages = { "com.vellasques.apiclientes" })
//@EnableAutoConfiguration
public class ApiclientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiclientesApplication.class, args);
	}

}
