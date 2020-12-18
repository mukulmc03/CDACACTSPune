package com.app.bank;

public abstract class BankAccounts {
	private int accountNo; 
	private String customerName, accountType; 
	private double balance;
	private static int idGenerator;
	
	static {
		idGenerator = 100;
	}

	public BankAccounts(String customerName, String accountType, double balance) {
		this.accountNo = idGenerator ++;
		this.customerName = customerName;
		this.accountType = accountType;
		this.balance = balance;
	}
	
	
	@Override
	public String toString() {
		return "\n\tAccount Number : " + accountNo + "\n\tCustomer Name : " + customerName + "\n\tAccount Type : "
				+ accountType + "\n\tBalance : " + balance;
	}
	
	public abstract double computeTax();
	
	public int getAccountNo() {
		return accountNo;
	}


	public double getBalance() {
		return balance;
	}


	public void withdraw(int accountNumber, double amount) {
		balance -=  amount;
		System.out.println("Amount Withdrawn is : " + amount + "Current Balance is : " + balance);
	}
	
	public void deposit(int accountNumber, double amount) {
		balance += amount;
		System.out.println("Amount Deposited is : " + amount + "Current Balance is : " + balance);
	}
}
