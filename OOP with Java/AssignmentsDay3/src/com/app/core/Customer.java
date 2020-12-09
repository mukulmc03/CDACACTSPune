package com.app.core;

public class Customer {
	private String name;
	private String email;
	private int age, creditLimit;
	
	public Customer(String n, String e, int a, int c) {
		name = n;
		email = e;
		age = a;
		creditLimit = c;
	}
	
	public Customer() {
		this("Riya", "riya@gmail.com", 25, 10000);
	}
	
	public Customer(String n1, String e1, int a1) {
		this(n1, e1, a1, 10000);
	}
	
	public String getDetails() {
		return "Customer Name: " + name;
	}
	
	public void setCreditLimit(int newCreditLimit) {
		creditLimit = newCreditLimit;
	}
	
	public int getCreditLimit() {
		return creditLimit;
	}
}
