package com.app.bank;

public class CurrentAccount extends BankAccounts {
	private double incomeTax;
	public CurrentAccount(String customerName, double balance) {
		super(customerName, "Current Account", balance);
	}
	
	@Override
	public double computeTax() {
		incomeTax = 0.01 * super.getBalance();
		return incomeTax;
	}
}
