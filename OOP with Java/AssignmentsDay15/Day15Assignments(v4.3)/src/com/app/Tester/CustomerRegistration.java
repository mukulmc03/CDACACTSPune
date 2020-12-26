package com.app.Tester;

import com.app.Org.*;
import java.util.*;

public class CustomerRegistration {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);) {
			boolean exit = false;
			ArrayList<Customer> cust = new  ArrayList<>();
			while (!exit) {
				System.out.println("Given Options");
				System.out.println("1. Register New Customer");
				System.out.println("2. Add Address for Perticular Customer");
				System.out.println("3. Fetch All Customers By Email and DOB");   		              // From A Specified City
				System.out.println("4. Customer Login");
				System.out.println("5. Unsuscribe Email");
				System.out.println("6. Display All Customers");
				System.out.println("7. Change the Phone Number");
				System.out.println("8. Show the Customer Details by the DOB");
				System.out.println("10. EXIT");
				System.out.println("Select Proper Option From Above:--");
				switch (sc.nextInt()) {
				case 1:																																					//done
					System.out.println("Enter the all details like Email, Password, Name, RegAmount, DOB(yyy-MM-dd)");
					
					Customer c = CustomerRules.validateData(cust,sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next());
					cust.add(c);
					break;
					
				case 2:
					System.out.println("Enter the Customer Mail-Id and DOB(yyy-mm-dd)");
					Customer c2 = CustomerRules.checkIfExist(sc.next(), sc.next(),cust);
					System.out.println("Enter the Address Details (City, State, Address, PhoneNumber)");
					c2.linkAddress(sc.next(), sc.next(), sc.next(), sc.next());
					break;
				
				case 3:
					System.out.println("Enter the Email and DOB(yyy-mm-dd) to find out All details of Customer");
					Customer c1 = CustomerRules.checkIfExist(sc.next(), sc.next(),cust);
					System.out.println(c1);
					break;

				case 4:																																								//done
					System.out.println("Enter the login ID ,DOB (yyyy-mm-dd)");
					c1 = CustomerRules.checkIfExist(sc.next(),sc.next(),cust);
					System.out.println("Login Complete...!!!!! Enjoy Game...");
					break;
					
				case 5:
					System.out.println("Enter the login ID ,DOB (yyyy-mm-dd)");
					c1 = CustomerRules.checkIfExist(sc.next(),sc.next(),cust);
					cust.remove(c1);
					System.out.println("U have unsuscribe mails..!!");
					break;
				case 6:
					System.out.println("Details of all customers are:---");
					for(Customer i : cust)
					{
						System.out.println(i);
					}
					break;
				case 7:
					System.out.println("Enter the login ID ,DOB (yyyy-mm-dd) to change phoneNo");
					c1 = CustomerRules.checkIfExist(sc.next(),sc.next(),cust);
					System.out.println("Enter The PhoneNo:--- ");
					CustomerRules.changePhoneNo(c1,sc.next());
					break;
				case 8:
					System.out.println("Enter the Starting date Ending date and amount to find all customer witin range ");
					CustomerRules.validDob(sc.next(),sc.next(),sc.nextDouble(),cust);
				break;
				
				case 10:
					exit = true;
					break;
				}

			}

		} catch (Exception e) {System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
