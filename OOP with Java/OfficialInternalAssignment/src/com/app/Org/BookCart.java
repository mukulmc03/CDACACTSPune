package com.app.Org;

public class BookCart {
	private String bookTitle;
	private int quantity;
	private double price;
	private double totalBill;
	
	public BookCart(String bookTitle, int quantity, double price) {
		super();
		this.bookTitle = bookTitle;
		this.quantity = quantity;
		this.price = price;
		this.totalBill = quantity * price;
	}
	
	public BookCart(int quantity) {
		this.quantity = quantity;
	}

	public BookCart() {
	}
	
	public BookCart(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return "Book Title : " + bookTitle + ", Quantity : " + quantity + ", Price per Book : ₹" + price + ", Total Price : ₹"
				+ totalBill;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof BookCart)
			return this.bookTitle.equals(((BookCart)obj).bookTitle);
		return false;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}
	
	
}
