package com.app.fruits;

public class Apple extends Fruits {
	public Apple(String name) {
		super(name);
	}
	
	public void taste() {
		System.out.println(super.getName() + " is sweet in Taste");
	}
}
