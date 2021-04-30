package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")

public class Alien {
	private int aid;
	private String aname;
	private String tech;
	@Autowired
	private Labpot labpot;
	
	
	public Alien() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("In Constructor and Object Created");
	}
	public int getAid() {
		return aid;
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
	
	
	public Labpot getLabpot() {
		return labpot;
	}
	public void setLabpot(Labpot labpot) {
		this.labpot = labpot;
	}
	
	public void show() {
		System.out.println("in show Method");
		labpot.compile();
	}
}
