package com.cenfotec.examen.examen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Lab5Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab5Application.class, args);
	}

}
