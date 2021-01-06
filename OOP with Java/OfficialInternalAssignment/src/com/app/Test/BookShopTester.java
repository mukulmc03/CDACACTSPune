package com.app.Test;

import java.awt.DisplayMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

import com.app.Org.Admin;
import com.app.Org.Book;
import com.app.Org.BookCart;
import com.app.Org.BookShopRules;
import com.app.Org.Customer;
import com.app.Utils.BookCollectionUtils;

public class BookShopTester {

	public static void main(String[] args) {
		boolean exit = false;
		try(Scanner sc = new Scanner(System.in)){
			ArrayList<Customer> customerList = BookCollectionUtils.populateCustomer();
			HashMap<String, Book> bookHashMap = BookCollectionUtils.populateBooks();
			ArrayList<BookCart> bookCartList = new ArrayList<BookCart>();
			System.out.println("\t1.Admin Login\n\t2. Customer Login");

			switch(sc.nextInt()) {
			case 1:
				Admin admin = BookCollectionUtils.addAdmin();
				System.out.println("\tPlease, enter Email & Password : ");
				BookShopRules.checkAdmin(sc.next(), sc.next(), admin);
				System.out.println("\tAdmin Login Successful!");
				System.exit(0);
				break;

			case 2:
				System.out.println("\tCustomer Login!");
				System.out.println("\tPlease, enter Email ID & Password : ");
				BookShopRules.checkCustomer(sc.next(), sc.next(), customerList);
				System.out.println("\tCustomer Login Successful!");

				while(!exit) {
					System.out.println("\tChoose one from the following");
					System.out.println("\t\t1. Display Available Books "
							+ "\n\t\t2. Add to Cart \n\t\t3. Show Cart\n\t\t4. Get Bill\n\t\t5. Remove Book from Cart"
							+ "\n\t\t6. Log Out!");

					switch(sc.nextInt()) {
					case 1:
						System.out.println("Available Books!");
						for(Entry<String, Book> availableBooks : bookHashMap.entrySet())
							System.out.println(availableBooks.getValue());
						break;

					case 2:
						System.out.println("Add Book to Cart!");
						System.out.println("Please, enter Book Name & Quantity");
						BookShopRules.checkBookExists(bookHashMap, sc.next(), sc.nextInt(), bookCartList);
						break;

					case 3:
						System.out.println("Your Cart : ");
						for(BookCart cart: bookCartList)
							if(cart != null)
								System.out.println(cart);
						break;

					case 4:
						System.out.println("Your total bill is : ");
						BookShopRules.totalBill(bookCartList);
						break;

					case 5:
						System.out.println("Please, enter name of the book you want to remove from cart : ");
						BookShopRules.removeBookFromCart(bookCartList, sc.next());
						System.out.println("Book removed from the cart Successfully!");
						break;

					case 6:
						System.out.println("Logged Out Successfully!");
						exit = true;
						break;

					default:
						System.out.println("Please, enter valid Input!");
						break;
					}
				}
				break;
				
			default:
				System.out.println("Please, enter valid Input!");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
