package com.app.org;

public class Emp {
	private int id, deptID;
	String name;
	double basic;
	
	public Emp(int id, String name, int deptID, double basic) {
		this.id = id;
		this.name = name;
		this.deptID = deptID;
		this.basic = basic;
	}
	
	@Override
	public String toString() {
		return "\n\tEmp Id: " + id + "\n\tEmp Name: " + name + "\n\tEmp deptID: " + deptID + 
				"\n\tEmp Basic: " + basic;
	}
	
	public double computeNetSalary() {
		return this.basic;
	}
}
