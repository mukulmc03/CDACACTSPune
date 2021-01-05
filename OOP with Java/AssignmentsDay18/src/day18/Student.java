package day18;

import java.time.LocalDate;

public class Student {
	public enum Course {
		SPRING, SPRING_BOOT, MERN, WT, DBT, DEVOPS, REACT;
	}
	private String prn;
	private String name;
	private double marks;
	LocalDate birthDate;
	private Course courseName;
	
	public Student(String prn, String name, Course courseName, double marks, LocalDate birthDate) {
		super();
		this.prn = prn;
		this.name = name;
		this.marks = marks;
		this.birthDate = birthDate;
		this.courseName = courseName;
	}
	
	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public Course getCourseName() {
		return courseName;
	}

	@Override
	public String toString() {
		return "Student [prn=" + prn + ", name=" + name + ", courseName=" + courseName +", marks=" + marks + ", birthDate=" + birthDate + "]";
	}
	
	
}
