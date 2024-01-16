package com.example.demo;


import org.springframework.stereotype.Component;

@Component
public class Alien {
	public int getAid() {
		return aid;
	}
	public Alien() {
		super();
		System.out.println("Object Created!");
		aid++;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	private static int aid;
	private String aname;
	private String tech;
	
	public void show() {
		System.out.println("In show():Alien");
	}

}
