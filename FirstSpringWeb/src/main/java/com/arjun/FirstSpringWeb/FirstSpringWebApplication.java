package com.arjun.FirstSpringWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringWebApplication.class, args);
		// Front Controller in the spring boot is responsible for indexing
		// the requestMappings to respective restControllers
	}

}
