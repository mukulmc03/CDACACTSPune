package com.app.Org;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Book {
	private String bookTitle;
	private BookCategory bookCat;
	private double price;
	private LocalDate publishDate;
	private int availableBooks;
	private int rating;
	private Set<BookAuthor> author = new HashSet<>();
	
	public Book(String bookTitle, String bookCat, double price, LocalDate publishDate,
			int availableBooks, int rating) {
		super();
		this.bookTitle = bookTitle;
		this.bookCat = BookCategory.valueOf(bookCat);
		this.price = price;
		this.publishDate = publishDate;
		this.availableBooks = availableBooks;
		this.rating = rating;
	}
	
	public Book(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public BookCategory getBookCat() {
		return bookCat;
	}

	public double getPrice() {
		return price;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public int getAvailableBooks() {
		return availableBooks;
	}

	public int getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return "Book Title : " + bookTitle + ", Book Author : " + author + ", bookCat=" + bookCat + ", price="
				+ price + ", publishDate=" + publishDate + ", quantity=" + availableBooks + ", rating=" + rating + "]";
	}
	
	public void linkAuthor(String name, String email) {
		author.add(new BookAuthor(name, email));
	}
	
	// Inner to add multiple authors to BookMap
	
	public class BookAuthor {
		private String name, email;

		public BookAuthor(String name, String email) {
			super();
			this.name = name;
			this.email = email;
		}
		
		@Override
		public String toString() {
			return "Author's Name : " + name + " Author's Email : " + email;
		}
		
	}
}
