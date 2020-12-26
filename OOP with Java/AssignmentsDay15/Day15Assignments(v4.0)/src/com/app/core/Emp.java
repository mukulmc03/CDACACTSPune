package com.app.core;

import java.time.LocalDate;

public class Emp {
	private int id;
	private String name;
	private double salary;
	private LocalDate joinDate;
	// + dept : enum
	private Department dept;
	// one to one association between Emp n AdharCard : composition
	private AdharCard card;

	public Emp(int id, String name, double salary, LocalDate joinDate, Department dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.joinDate = joinDate;
		this.dept = dept;
	}

	// overloaded constr
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + " joining on " + joinDate
				+ " dept " + dept+"\n "+card;
	}

	@Override
	public boolean equals(Object o) {
	//	System.out.println("in emp equals");
		if (o instanceof Emp) {
			Emp e = (Emp) o;
			return id == e.id && this.name.equals(e.name);
		}
		return false;
	}
	//add a method to link adhar card details to emp
	public void linkAdharCard(String cardNo1, LocalDate creationDate1, String location1)
	{
		//associate card details to an emp
		card=new AdharCard(cardNo1, creationDate1, location1);
		
	}
	//getter for AdharCard'c location
	public String getAdharCardLocation()
	{
		return card.location;
	}
	//getter for card's creation date in the outer class
	public LocalDate getCreationDate()
	{
		return card.creationDate;
	}
	

	public  int getId() {
		return id;
	}
	//setter method in the outer class to update card no
	public void setEmpAdharCardNumber(String cardNo)
	{
		card.cardNo=cardNo;
	}

	public  String getName() {
		return name;
	}



	// non static nested class : inner class
	private  class AdharCard {
		private String cardNo;
		private LocalDate creationDate;
		private String location;
		public AdharCard(String cardNo, LocalDate creationDate, String location) {
			super();
			this.cardNo = cardNo;
			this.creationDate = creationDate;
			this.location = location;
		}
		@Override
		public String toString() {
			return "AdharCard [cardNo=" + cardNo + ", creationDate=" +creationDate + ", location=" + location + "]";
		}
		
		
	}

}
