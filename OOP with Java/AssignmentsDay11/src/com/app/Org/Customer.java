package com.app.Org;

import java.util.Date;

public class Customer {
	private String email, name, password, city;
	private double registrationAmount;
	private Date dob;
	
	public Customer(String email, String name, String password, String city, double registrationAmount, Date dob) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.city = city;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
	}			
	
	public Customer(String email, Date dob) {
		super();
		this.email = email;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "\n\tCustomer Details : \n\tEmail : " + email + "\n\tName : " +
				name + "\n\tPassword : " + password + "\n\tCity : " + city
				+ "\n\tRegistration Amount : " + registrationAmount;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Customer)
			return (this.email.equals(((Customer)obj).email) && (this.dob.equals(((Customer)obj).dob)));
		return false;
	}

	public String getEmail() {
		return email;
	}

	public String getCity() {
		return city;
	}

}
