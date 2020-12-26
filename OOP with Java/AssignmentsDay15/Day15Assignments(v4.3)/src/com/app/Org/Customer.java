package com.app.Org;
import java.time.*;

public class Customer {
	private String email; 																		// email , password , name , registration amount , city
	private String password;
	private String name;
	private double regAmount;
	private LocalDate dob;
	private Address add;
	static private boolean flag = true;

	public Customer(String email, String password, String name, double regAmount, LocalDate dob) {			 // constructor
		this.email = email;
		this.password = password;
		this.name = name;
		this.regAmount = regAmount;
		this.dob = dob;
	}
	
	public Customer(String email,LocalDate dob)												// to make instance for email only for overriding the equals method
	{
		this.email = email;
		this.dob = dob;
	}

	@Override 																								// To Display the Details of the Customers
	public String toString() {
		return "Customer Detail:---   email=" + this.email + ", name=" + this.name + ", regAmount=" + this.regAmount +", DOB="+this.dob+"\n" +add;
	}
	
	@Override
	public boolean equals(Object o) 
	{
		if (o instanceof Customer) 
		return ( this.email.equals(((Customer) o).email)  && (  this.dob.equals( ((Customer)o).dob) )    );
	 	return false;																						//return ((o instanceof Customer) && (this.email.equals(((Customer)o).email))); return false; }
	}

	public double getRegAmount() {
		return this.regAmount;
	}
	public String getEmail() {
		return this.email;
	}
	public String getPassword() {
		return this.password;
	}
	public LocalDate getDob() {
		return this.dob;
	}
	
	public void linkAddress(String city, String state, String country, String phoneNo )
	{
		//associate Address details to an emp
		add=new Address(city, state, country,phoneNo);
	}
	
	public String getCity() {
		return add.city;
	}
	
	
	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}
	
	public String getPhoneNo() {
		return add.phoneNo;
	}
	public void setPhoneNo(String newphone) {
		add.phoneNo = newphone;
	}

	//new class associate
	private class Address{
		private String city ,state ,country , phoneNo;
		
		public Address(String city ,String state , String country ,String phoneNo) {
			this.city = city;
			this.state = state;
			this.country=country;
			this.phoneNo=phoneNo;
		}
	
		@Override 																						// To Display the Details of the Customers
		public String toString() {
			return "Address Detail:---  City= "+city+"  State="+state+"  Country= "+country+"  phoneNo= "+phoneNo;
		}	
	}
}