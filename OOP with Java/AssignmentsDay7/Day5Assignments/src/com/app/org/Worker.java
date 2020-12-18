package com.app.org;

public class Worker extends Emp {
	private int id, deptID;
	String name; 
	double basic, hoursWorked, hourlyRate;
	
	public Worker(int id, String name, int deptID, double basic, double hoursWorked, double hourlyRate) {
		super(id, name, deptID, basic);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	@Override
	public String toString() {
		return "\n\tWorker details are : " + super.toString() + "\n\tWorked Hours: " + hoursWorked + 
				"\n\tWorkers Hourly Rate: " + hourlyRate;
	}
	
	public double computeNetSalary() {
		return super.computeNetSalary() + (hoursWorked * hourlyRate);
	}
	
	public String getHourlyRate() {
		return "\n\tWorker Hourly Rate: " + hourlyRate;
	}
}
