package com.app.org;

public class Mgr extends Emp {
	private int id, deptID;
	String name;
	private double basic, perfBonus;
	
	public Mgr(int id, String name, int deptID, double basic, double perfBonus) {
		super(id, name, deptID, basic);
		this.perfBonus = perfBonus;
	}
	
	@Override
	public String toString() {
		return "Manager Details are : " + super.toString() + basic;
	}
	
	public double computeNetSalary() {
		return super.computeNetSalary() + perfBonus;
	}
	
	public String getPerformanceBonus() {
		return "\n\tManager Performance Bonus: " + perfBonus;
	}
}
