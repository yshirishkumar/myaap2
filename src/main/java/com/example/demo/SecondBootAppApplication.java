package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecondBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondBootAppApplication.class, args);
		System.out.println("Mesg");
	}

}
