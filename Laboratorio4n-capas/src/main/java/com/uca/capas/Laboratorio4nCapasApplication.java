package com.uca.capas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages=("com.uca.capas.controller"))
@ComponentScan(basePackages=("com.uca.capas..domain"))
public class Laboratorio4nCapasApplication {

	public static void main(String[] args) {
		SpringApplication.run(Laboratorio4nCapasApplication.class, args);
	}

}
