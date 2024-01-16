package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component

public class Alien {
	
	@Autowired
	private Laptop lpt;
	
	public void show() {
		System.out.println("In show():Alien");
		lpt.compile();
	}

}
