/* 4. 
Write a program that would print the information (name, year of joining, salary, address) of three employees by creating 
a class named 'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat */

import java.util.*;

class Employee{
	String name;
	int yearofjoining;
	String address;

	public static void main(String[] args) {
		Employee e1 = new Employee();
	e1.name = "Robert";
	e1.yearofjoining = 1994;
	e1.address = "64c - WallsStreat";
	
	Employee e2 = new Employee();
	e2.name = "Sam";
	e2.yearofjoining = 2000;
	e2.address = "68D - WallsStreat";

	Employee e3 = new Employee();
	e3.name = "John";
	e3.yearofjoining = 1999;
	e3.address = "26B - WallsStreat";

	System.out.println("Name\t Year Of Joining\t Address");
	System.out.format("%s\t %d\t\t\t %s\n", e1.name, e1.yearofjoining, e1.address);
	System.out.format("%s\t %d\t\t\t %s\n", e2.name, e2.yearofjoining, e2.address);
	System.out.format("%s\t %d\t\t\t %s\n", e3.name, e3.yearofjoining, e3.address);
	}


}