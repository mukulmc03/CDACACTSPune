package com.app.Tester;

import java.util.Date;
import com.app.Org.*;
import java.util.*;

public class CustomerRegistration {
	public static void main(String[] args) {

		
		try(Scanner sc = new Scanner(System.in);) {
			System.out.println("Enter the Numbers of Customer you want to collect");
			Customer[] cust = new Customer[sc.nextInt()];
			boolean exit = false;
			int index = 0;
			while (!exit) {
				System.out.println("Given Options");
				System.out.println("1. Register New Customer");
				System.out.println("2. Display All Customers From A Specified City");
				System.out.println("3. EXIT");
				System.out.println("Select Proper Option From Above:--");
				switch (sc.nextInt()) {

				case 1:

					if (index < cust.length) {
						System.out.println("Enter the all details like Email, Password, Name, RegAmount, DOB(yyy-MM-dd), Customer Type(GOLD, SILVER, PLATINUM)");
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
						cust[index] = c;
						System.out.println("Customer Registration Successful!");
						System.out.println("Enter your City, State, Country , PhoneNo : ");
						String city = sc.next();
						String state = sc.next();
						String country = sc.next();
						String phoneNo = sc.next();
						CustomerRules.checkAddress(country);
						c.linkAddress(city, state, country, phoneNo);
						System.out.println("Customer Address linked Successfully!");
						index++;
					} else
						System.out.println("Database Is Full...!!");


					break;

				case 2:
					if (index >= 0 && index <= cust.length) {
						System.out.println("Enter The City Name To Find All Customer From There:- ");
						String city = sc.next();

						for (Customer c : cust) {
							if (c != null) {
								if (c.getCity().equals(city))
									System.out.println(c);
							}
						}

					} else
						System.out.println("Data is Empty!");
					break;

				case 3:
					exit = true;
					break;

				}
		}} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
} 

