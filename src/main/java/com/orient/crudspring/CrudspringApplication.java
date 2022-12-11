package com.orient.crudspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class CrudspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudspringApplication.class, args);
	}

}
