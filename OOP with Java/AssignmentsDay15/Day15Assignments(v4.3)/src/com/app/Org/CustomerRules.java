package com.app.Org;

import java.util.ArrayList;
import java.time.*;

public class CustomerRules {
										// simpledateformat
	public static int MINLEN;
	public static int MAXLEN;
	public boolean flag;
	static {
		MINLEN = 8;
		MAXLEN = 15;
	}

	public static void checkDuplicate(String mail, ArrayList<Customer> cus, LocalDate date) throws UserException {
		for (Customer i : cus) {
			if (i.getEmail().contains(mail) && (i.getDob().equals(date)))
				throw new UserException("User is already exist...!!!!");
		}
	}
	
	//====================================================
	
	/*
	 * public static void validateEmail(String mail, Customer[] custm) throws
	 * UserException { for (Customer c : custm) { if (c != null) { if
	 * (mail.equals(c.getEmail())) throw new
	 * UserException("User is Already Exist..!!"); } } }
	 */

	//=====================================================
	
	
	public static void checkEmail(String mail) throws UserException {
		if (!mail.contains("@"))
			throw new UserException("Email Must include @ char...!!");
		if (mail.length() < MINLEN || mail.length() > MAXLEN)
			throw new UserException("Email charectors must be within 7 to 15 char..!!");
		if (!mail.endsWith(".com"))
			throw new UserException("Email must end with .com");
	}

	//=======================================================
	
	public static void checkPassword(String password) throws UserException {
		if (!(password.matches("((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{6,20})")))
			throw new UserException("Your password is not in proper format...!!");
	}
	
	//=======================================================

	public static void checkRegAmount(double amount) throws UserException {
		if (!(amount % 500 == 0))
			throw new UserException("Amount must be multiple of 500..!!");
	}
	
	//=======================================================

	/*
	 * public static void validateCredentials(String id, String pass, String dob,
	 * ArrayList<Customer> cus) throws UserException, ParseException { LocalDate x =
	 * LocalDate.parse(dob);
	 * 
	 * for (Customer i : cus) { if (!(i.getEmail().contains(id) &&
	 * (i.getDob().equals(x)) && (i.getPassword().contains(pass)))) throw new
	 * UserException("login UNsuccesfull "); } }
	 */
	
	//=======================================================

	/*
	 * public static void FetchCustomer(String id, String dob, ArrayList<Customer>
	 * cus) throws UserException, ParseException { LocalDate x =
	 * LocalDate.parse(dob); for (Customer i : cus) { if
	 * (!(i.getEmail().contains(id) && (i.getDob().equals(x)))) throw new
	 * UserException("invalid data "); else { Customer e = new Customer(id, x); int
	 * index = cus.indexOf(e); System.out.println(cus.get(index)); } } }
	 */
	
	//=======================================================
	
	/*
	 * public static void unsuscribeEmail(String id, String dob, ArrayList<Customer>
	 * cus) throws UserException, ParseException { LocalDate x =
	 * LocalDate.parse(dob); for (Customer i : cus) { if
	 * (!(i.getEmail().contains(id) && (i.getDob().equals(x)))) throw new
	 * UserException("invalid data "); else { Customer e = new Customer(id, x); int
	 * index = cus.indexOf(e); cus.remove(index); System.out.println(cus); } } }
	 */
//================================================
	
	public static void validDob(String startdob,String enddob,double amount, ArrayList<Customer> custm ) throws UserException  {
		LocalDate startdate = LocalDate.parse(startdob); 	LocalDate enddate = LocalDate.parse(enddob);
		for(Customer i : custm)
		{
			if(i.getDob().isAfter(startdate) && i.getDob().isBefore(enddate)  && ( i.getRegAmount()<amount) )  
						System.out.println(i);
			else
				throw new UserException("Its Empty");
		}	
	}
//================================================
	
	public static void changePhoneNo(Customer temp , String newphone) throws UserException {
		if (temp.getAdd() != null)
			temp.setPhoneNo(newphone);
		else
			throw new UserException("plzzz add all details of address");
	}
//================================================
	
public  static Customer validateData(ArrayList<Customer> custm,String email,String password,String name,double regAmount,String dob) throws UserException {
			checkEmail(email);  	checkPassword(password);  	 checkRegAmount(regAmount);   
	   		LocalDate date = LocalDate.parse(dob);			  
	   		checkDuplicate(email,custm,date);
		return new Customer(email,password,name,regAmount,date);
	}

//================================================

public static Customer checkIfExist(String email,String dob,ArrayList<Customer> custm)throws UserException {
	LocalDate date = LocalDate.parse(dob);
	Customer c =new Customer(email,date);
	int index = custm.indexOf(c);
	if(index == -1)
			throw new UserException("Invalid data... wrong Credential");
	return custm.get(index);  									//It will retrive object which is at index
}
	
	
}