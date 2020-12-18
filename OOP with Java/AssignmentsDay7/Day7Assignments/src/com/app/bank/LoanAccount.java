package com.app.bank;

public class LoanAccount extends BankAccounts {
	private int years;
	private double emi;
	private double incomeTax;
	public LoanAccount(String customerName, double balance, int years) {
		super(customerName, "Loan Account", balance);
		this.years = years;
	}
	
	public String getLoanDetails() {
		emi = super.getBalance() / years;
		return "Your EMI is " + emi + " for period of : " + (years * 12) + " months";
	}
	
	@Override
	public double computeTax() {
		incomeTax = (0.5 * super.getBalance()) - (0.1 * emi) ;
		return incomeTax;
	}
}
