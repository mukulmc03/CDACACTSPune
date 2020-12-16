package com.app.fruits;

public class Orange extends Fruits{
	public Orange(String name) {
		super(name);
	}
	
	public void taste() {
		System.out.println(super.getName() + " is sour in Taste");
	}
}
