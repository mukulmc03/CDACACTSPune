package com.app.tester;

import java.util.Scanner;

import com.app.core.*;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student 1 Details : (name), (email), (age) : ");
		Student s1 = new Student(sc.nextLine(), sc.nextLine(), sc.nextInt());
		
		sc.nextLine();
		System.out.println("Enter Student 2 Details : (name), (email), (age) : ");
		Student s2 = new Student(sc.nextLine(), sc.nextLine(), sc.nextInt());
		
		System.out.println("Enter Student 1 scores: (quiz), (test), (assignment) : ");
		double gpa1 = s1.computeGPA(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		
		System.out.println("Enter Student 2 scores: (quiz), (test), (assignment) : ");
		double gpa2 = s2.computeGPA(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		
		if(gpa1 > gpa2) {
			System.out.println("Student having Higher GPA : " + s1.fetchDetails());
		}
		else {
			System.out.println("Student having Higher GPA : " + s2.fetchDetails());
		}
		
		sc.close();
	}
}
