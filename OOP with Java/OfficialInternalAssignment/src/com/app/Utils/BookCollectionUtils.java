package com.app.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import static java.time.LocalDate.*;

import com.app.Org.Admin;
import com.app.Org.Book;
import com.app.Org.Customer;

public class BookCollectionUtils {
	public static Admin addAdmin() {
		Admin admin = new Admin("admin", "admin123");
		return admin;
	}
	
	public static ArrayList<Customer> populateCustomer(){
		ArrayList<Customer> addCustomer = new ArrayList<Customer>();
		addCustomer.add(new Customer("Mukul", "mc@gmail.com", "mukul"));
		addCustomer.add(new Customer("Rahul", "rc@gmail.com", "rahul"));
		addCustomer.add(new Customer("Bhushan", "bc@gmail.com", "bhushan"));
		addCustomer.add(new Customer("Sara", "sc@gmail.com", "sara"));
		addCustomer.add(new Customer("Ayush", "ac@gmail.com", "ayush"));
		return addCustomer;
	}
	
	public static HashMap<String, Book> populateBooks(){
		HashMap<String, Book> bookMap = new HashMap<String, Book>();
		Book book1 = new Book("Nineteen Eighty-Four", "FICTION", 100, parse("1949-06-08"), 5, 4);
		bookMap.putIfAbsent("Nineteen Eighty-Four", book1);
		book1.linkAuthor("George Orwell", "go@gmail.com");
		
		Book book2 = new Book("The Great Gatsby", "FICTION", 150, parse("1925-02-03"), 5, 4);
		bookMap.putIfAbsent("The Great Gatsby", book2);
		book2.linkAuthor("F. Scott Fitzgerald", "fsf@gmail.com");
		
		Book book3 = new Book("A Brief History of Time", "SCIENCE", 200, parse("1988-03-04"), 5, 5);
		bookMap.putIfAbsent("A Brief History of Time", book3);
		book3.linkAuthor("Stephen Hawking", "sh@gmail.com");
		
		Book book4 = new Book("On the Origin of Species", "SCIENCE", 250, parse("1859-11-25"), 5, 4);
		bookMap.putIfAbsent("On the Origin of Species", book4);
		book4.linkAuthor("Charles Darwin", "cd@gmail.com");
		
		Book book5 = new Book("The Millionaire Next Door: The Surprising Secrets of America's Wealthy", "FINANCE", 300, parse("1996-01-04"), 5, 5);
		bookMap.putIfAbsent("The Millionaire Next Door: The Surprising Secrets of America's Wealthy", book5);
		book5.linkAuthor("Thomas J. Stanley", "tjs@gmail.com");
		
		Book book6 = new Book("The Intelligent Investor", "FINANCE", 350, parse("1949-03-04"), 5, 4);
		bookMap.putIfAbsent("The Intelligent Investor", book6);
		book6.linkAuthor("Benjamin Graham", "bg@gmail.com");
		
		Book book7 = new Book("Yoga Sutras of Patanjali", "YOGA", 400, parse("1992-04-03"), 5, 4);
		bookMap.putIfAbsent("Yoga Sutras of Patanjali", book7);
		book7.linkAuthor("Baba Ramdev", "br@gmail.com");
		
		Book book8 = new Book("Light on Yoga", "YOGA", 450, parse("2002-05-04"), 5, 5);
		bookMap.putIfAbsent("Light on Yoga", book8);
		book8.linkAuthor("B. K. S. Iyengar", "bksi@gmail.com");
		
		Book book9 = new Book("Wherever You Go, There You Are", "MEDITATION", 500, parse("1994-06-07"), 5, 4);
		bookMap.putIfAbsent("Wherever You Go, There You Are", book9);
		book9.linkAuthor("Jon Kabat-Zinn", "jkz@gmail.com");
		
		Book book10 = new Book("The Miracle of Mindfulness", "MEDITATION", 550, parse("1995-07-06"), 5, 4);
		bookMap.putIfAbsent("The Miracle of Mindfulness", book10);
		book10.linkAuthor("Thich Nhat Hanh", "tnh@gmail.com");
		book10.linkAuthor("Ajay", "aj@gmail.com");
		
		return bookMap;
		
	}
}
