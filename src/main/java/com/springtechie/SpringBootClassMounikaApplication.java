package com.springtechie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.spring","com.springtechie"})
public class SpringBootClassMounikaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootClassMounikaApplication.class, args);
	}

}
