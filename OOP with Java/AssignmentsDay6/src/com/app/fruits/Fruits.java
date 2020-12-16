package com.app.fruits;

public class Fruits {
	private String name;

	public Fruits(String name) {
		super();
		this.setName(name);;
		// TODO Auto-generated constructor stub
	}
	
	public void taste() {
		System.out.println("No specific Taste");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
