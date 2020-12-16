package com.app.fruits;

public class Cherry extends Fruits{
	public Cherry(String name) {
		super(name);
	}
	
	public void taste() {
		System.out.println(super.getName() + " is sweet & sour in Taste");
	}
}
