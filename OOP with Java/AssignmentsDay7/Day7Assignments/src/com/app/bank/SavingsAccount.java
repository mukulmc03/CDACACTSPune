package com.app.bank;

public class SavingsAccount extends BankAccounts {
	private double simpleInterest, incomeTax;
	public SavingsAccount(String customerName, double balance) {
		super(customerName, "Savings Account", balance);
	}
	
	public double simpleInterest(int years) {
		simpleInterest = (super.getBalance() * years * 5) / 100;
		System.out.println("Your Savings Bank Account Number : " + super.getAccountNo() + " has Interest"
				+ "of ₹ : " + simpleInterest);
		return simpleInterest;
	}
	
	@Override
	public double computeTax() {
		incomeTax = 0.1 * simpleInterest;
		return incomeTax;
	}
}
