// 7. Write a program to enter the age of a person and check whether the person is eligible for voting or not ?

import java.util.*;

class Vote{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please, enter your age");
		int age = sc.nextInt();

		if(age < 18){
			System.out.println("You are not eligible to Vote");
		}
		else{
			System.out.println("You are eligible to Vote");
		}
	}
}