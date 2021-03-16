package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootFirstProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootFirstProjectApplication.class, args);
		System.out.println("Welcome to Boot....");
		
		Alien a= (Alien)context.getBean(Alien.class);
		a.show();
		
		Alien a1= (Alien)context.getBean(Alien.class);
		a1.show();
	}

}
