package com.example.CachingMech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication

@EnableCaching
public class CachingMechApplication {

	public static void main(String[] args) {
		SpringApplication.run(CachingMechApplication.class, args);
	}

}
