package com.app.Org;

import java.util.ArrayList;
import java.util.HashMap;

public class BookShopRules {
	public static void checkAdmin(String email, String password, Admin admin) throws UserException {
		if(!(email.equals(admin.getEmail()) && password.equals(admin.getPassword())))
			throw new UserException("Admin's Email ID or Password is incorrect!");
	}
	
	public static void checkCustomer(String email, String password, ArrayList<Customer> customerList) throws UserException {
		Customer temp = new Customer(email,password);
		int i = customerList.indexOf(temp);
		if(i == -1)
			throw new UserException("Customer's Email ID or Password is incorrect!");
	}
	
	public static void displayAvailableBooks(HashMap<String, Book> bookHashMap) {
		bookHashMap.forEach((b1, b2) -> System.out.println(b2));
	}
	
	public static void checkBookExists(HashMap<String, Book> bookHashMap, String bookTitle, int quantity, ArrayList<BookCart> bookCart) throws UserException {
		if(!(bookHashMap.containsKey(bookTitle) && bookHashMap.get(bookTitle).getAvailableBooks() > 0))
			throw new UserException("Book is not Available!");
		double price = bookHashMap.get(bookTitle).getPrice();
		bookCart.add(new BookCart(bookTitle, quantity, price));
	}
	
	public static void totalBill(ArrayList<BookCart> bookCartList) {
		double totalBill = 0;
		for(BookCart cart : bookCartList) {
			totalBill += cart.getTotalBill();
		}
		System.out.println("₹" + totalBill);
	}
	
	public static void removeBookFromCart(ArrayList<BookCart> bookCartList, String bookName) throws UserException {
		BookCart bookTitle = new BookCart(bookName);
		int index = bookCartList.indexOf(bookTitle);
		if(index == -1)
			throw new UserException("Book is not present in your cart!");
		bookCartList.remove(index);
	}
}
