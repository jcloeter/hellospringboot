package com.clouder.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

	// To run, use the maven wrapper with a clean run:
		// ./mvnw clean spring-boot:run

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}
