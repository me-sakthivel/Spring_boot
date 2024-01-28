package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Alien;

@SpringBootApplication
public class SprinBootJdbc1Application {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext obj = SpringApplication.run(SprinBootJdbc1Application.class, args);
		Alien A = obj.getBean(Alien.class);
		A.setId(1);
		A.setName("Endless");
		A.setTech("C++");
		AlienRepo AP = obj.getBean(AlienRepo.class);
		AP.save(A);
		System.out.println(AP.findAll());
		
	}

}
