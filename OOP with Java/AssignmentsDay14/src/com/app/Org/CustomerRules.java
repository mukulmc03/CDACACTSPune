package com.app.Org;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CustomerRules {
	public static SimpleDateFormat sdf;
	public static int MINLEN, MAXLEN;
	boolean flag;
	
	static {
		MINLEN = 8;
		MAXLEN = 15;
		sdf = new SimpleDateFormat("yyyy-MM-dd");
	}
	
	public static void validateEmail(String email, ArrayList<Customer> cust, Date date) throws UserException {
		Customer e = new Customer(email, date); 
			if(cust.contains(e)) 
				throw new UserException("Customer already Exists!"); }
	
	public static void checkEmail(String email) throws UserException{
		if(!email.contains("@"))
			throw new UserException("Email must include \"@");
		if(email.length() < MINLEN || email.length() > MAXLEN)
			throw new UserException("Email length must be within 7 to 15 characters!");
		if(!email.endsWith(".com"))
			throw new UserException("Email must end with \".com");
	}
	
	public static void checkPassword(String password) throws UserException{
		if(!(password.matches("((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{6,20})")))
			throw new UserException("Your password is not in proper format!");
	}
	
	public static void checkRegistrationAmount(double registrationAmount) throws UserException{
		if(!(registrationAmount % 500 == 0))
			throw new UserException("Amount must be multipleof 500!");
	}
	
	public static void checkAddress(String country) throws UserException{
		if(!(country.equals("India")))
			throw new UserException("Customer must belong to India!");
	}
	
	public static void fetchCustomer(String email, String dob, ArrayList<Customer> cust) throws UserException, ParseException {
		Date d = sdf.parse(dob);
		for(Customer i : cust) {
			if(!(i.getEmail().contains(email) && (i.getDOB().equals(d))))
				throw new UserException("Customer does not exists!");
			else {
				Customer e = new Customer(email, d);
				int index = cust.indexOf(e);
				System.out.println(cust.get(index));
			}
		}
	}
	
	public static void checkCredentials(String email, String dob, String password, ArrayList<Customer> cust) throws UserException, ParseException {
		Date d = sdf.parse(dob);
		for(Customer i : cust) {
			if(!(i.getEmail().contains(email) && (i.getDOB().equals(d)) && (i.getPassword().contains(password))))
				throw new UserException("Invalid Credentials");
		}
	}
	
	public static void unsubscribeCustomer(String email, String dob, ArrayList<Customer> cust) throws UserException, ParseException{
		Date d = sdf.parse(dob);
		for(Customer i : cust) {
			if(!(i.getEmail().contains(email) && i.getDOB().equals(d)))
				throw new UserException("Customer not present!");
			else {
				Customer e = new Customer(email, d);
				int index = cust.indexOf(e);
				cust.remove(index);
				System.out.println(cust);
			}
		}
	}
}
