package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages ={ "com.example.entitie"})
@EnableJpaRepositories(basePackages ={ "com.example.repository"})  
@ComponentScan({"com.example.controller" })

@SpringBootApplication
public class Bot01Application {

	public static void main(String[] args) {
		SpringApplication.run(Bot01Application.class, args);
	}
}
