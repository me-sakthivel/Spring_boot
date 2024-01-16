package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext obj =SpringApplication.run(FirstProjectApplication.class, args);
		Alien a1 = obj.getBean(Alien.class);
		a1.show();
		
	}

}
