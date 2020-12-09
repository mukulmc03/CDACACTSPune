package com.app.tester;

import com.app.core.*;

import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter name, email, age of a customer: ");
		Customer c1 = new Customer(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
		Customer c2 = new Customer();
		sc.nextLine();
		Customer c3 = new Customer(sc.nextLine(), sc.nextLine(), sc.nextInt());
		
		System.out.println(c1.getDetails());
		System.out.println(c2.getDetails());
		System.out.println(c3.getDetails());
		
		sc.nextLine();
		System.out.println("Please, Change Credit Limit!");
		c3.setCreditLimit(sc.nextInt());
		System.out.println("New Credit Limit : " + c3.getCreditLimit());
		sc.close();
	}

}
