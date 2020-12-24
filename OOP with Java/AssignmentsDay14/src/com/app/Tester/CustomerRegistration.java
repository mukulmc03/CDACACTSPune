package com.app.Tester;

import com.app.Org.*;
import java.util.*;

public class CustomerRegistration {
	public static void main(String[] args) {

		
		try(Scanner sc = new Scanner(System.in);) {
			ArrayList<Customer> cust = new ArrayList<Customer>();
			boolean exit = false;
			while (!exit) {
				System.out.println("Given Options");
				System.out.println("1. Register New Customer");
				System.out.println("2. Get Customer Details");
				System.out.println("3. Customer Login");
				System.out.println("4. Unsubscribe Customer");
				System.out.println("5. Display all Customers");
				System.out.println("6. Exit");
				switch (sc.nextInt()) {

				case 1:
					System.out.println("Register New Customer!");
					System.out.println("Enter all details like Email, Password, Name, RegAmount, DOB(yyyy-MM-dd)");
					String email = sc.next();
					CustomerRules.checkEmail(email);
					String password = sc.next();
					CustomerRules.checkPassword(password);
					String name = sc.next();
					double registrationAmount = sc.nextInt();
					CustomerRules.checkRegistrationAmount(registrationAmount);
					Date dob =CustomerRules.sdf.parse(sc.next());
					CustomerRules.validateEmail(email, cust, dob);
					Customer c = new Customer(email, name, password, registrationAmount, dob);
					cust.add(c);
					System.out.println("Customer Registration Successful!");
					break;

				case 2:
					System.out.println("Get Customer Details!");
					System.out.println("Enter your email & date of birth : ");
					CustomerRules.fetchCustomer(sc.next(), sc.next(), cust);
					break;
				
				case 3:
					System.out.println("Customer Login!");
					System.out.println("Enter Email ID, Date of Birth & Password : ");
					CustomerRules.checkCredentials(sc.next(), sc.next(), sc.next(), cust);
					System.out.println("Customer Logged In Successfully!");
					break;
					
				case 4:
					System.out.println("Unsubscribe Customer!");
					System.out.println("Enter Email ID & Date Of Birth : ");
					CustomerRules.unsubscribeCustomer(sc.next(), sc.next(), cust);
					System.out.println("Customer Unsubscribed Successfully!");
					break;
					
				case 5:
					System.out.println("Details of all Customers : ");
					for(Customer i : cust) {
						System.out.println(i);
					}
					break;
					
				case 6:
					exit = true;
					break;

				}
			}
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
} 

