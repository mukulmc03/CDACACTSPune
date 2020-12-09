package com.app.core;

public class Student {
	private static int idCounter = 1;
	private int age, id;
	private double gpa;
	private String name, email;
	
	public Student(String name, String email, int age) {
		this.name = name;
		this.email = email;
		this.age = age;
		this.id = idCounter++;
	}
	
	public String fetchDetails() {
		return "\nStudent ID: " + id + "\nStudent Name: " + name + "\nStudent Age: " + age + 
				"\nStudent Email: " + email; 
	}
	
	public double computeGPA(double quizMarks, double testMarks, double assignmentMarks) {
		return gpa = ((0.2 * quizMarks) + (0.5 * testMarks) + (0.3 * assignmentMarks)) / 10;
	}
}
