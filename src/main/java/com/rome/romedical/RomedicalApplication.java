package com.rome.romedical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class RomedicalApplication {

	public static void main(String[] args) {
		SpringApplication.run(RomedicalApplication.class, args);
	}

}
