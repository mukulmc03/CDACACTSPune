package com.app.Org;

import java.util.Date;

public class Customer {
	private String email, name, password;
	private double registrationAmount;
	private Date dob;
	private CustomerAddress custAdd;
	
	public Customer(String email, String name, String password, double registrationAmount, Date dob) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
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
				name + "\n\tPassword : " + password + "\n\tRegistration Amount : " + registrationAmount;
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
	
	public void linkAddress(String city, String state, String country, String phoneNo) {
		custAdd = new CustomerAddress(city, state, country, phoneNo);
	}
	
	public String getCity() {
		return custAdd.city;
	}
	
	private class CustomerAddress{
		private String city, state, country, phoneNo;

		
		public CustomerAddress(String city, String state, String country, String phoneNo) {
			super();
			this.city = city;
			this.state = state;
			this.country = country;
			this.phoneNo = phoneNo;
		}
		
		
		@Override
		public String toString() {
			return "CustomerAddress [city=" + city + ", state=" + state + ", country=" + country + ", phoneNo="
					+ phoneNo + "]";
		}
	}
}
