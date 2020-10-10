//Calculate grades of students using their marks

package eDACAssignments;

import java.util.*;

public class StudGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Marks: ");
		int marks = sc.nextInt();
		
		if(marks >= 75) {
			System.out.println("You are Fisrt Class");
		}else if(marks >= 60 & marks < 75) {
			System.out.println("You are Second Class");
		}else if(marks >= 40 & marks < 60) {
			System.out.println("You are Third Class");
		}else if(marks < 40) {
			System.out.println("You are Failed");
		}
		sc.close();
	}
}
