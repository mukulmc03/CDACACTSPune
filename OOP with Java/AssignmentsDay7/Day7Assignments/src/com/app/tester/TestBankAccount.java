package com.app.tester;

import java.util.Scanner;

import com.app.bank.*;

public class TestBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean exit = false;
		int counter = 0;
		
		BankAccounts bankAcc[] = new BankAccounts[100];
		
		while(!exit) {
			System.out.println("Menu");
			System.out.println("\n\t1. Open Saving Account");
			System.out.println("\n\t2. Open Current Account");
			System.out.println("\n\t3. Open Lone Account");
			System.out.println("\n\t4. Withdraw ");
			System.out.println("\n\t5. Deposit");
			System.out.println("\n\t6. Get Account Details");
			System.out.println("\n\t7. Bank Mng wants to apply interest on all the saving type of account ");
			System.out.println("\n\t8. Under Bank Mng role prepare a summary having account number and compute tax ");
			System.out.println("\n\t9. Display Loan Details ");
			System.out.println("\n\t10.  EXIT");
			System.out.println("\n\tSelect The Option:");
			
			switch(sc.nextInt()) {
			case 1:																													// done
				if(counter < bankAcc.length){
					System.out.println("Enter the bank Details:-   Name , Balance ");
					bankAcc[counter] = new SavingsAccount(sc.next(), sc.nextDouble()) ; 
							counter ++;
				}
				else {
						System.out.println("Bank Accounts are  full..!!!");
						System.exit(0);
				}		
				break;
				
			case 2:																													//done
				if(counter < bankAcc.length){
					System.out.println("Enter the bank Details:-   Name , Balance ");
					bankAcc[counter] = new CurrentAccount(sc.next(), sc.nextDouble()) ; 
							counter++;
				}
				else {
						System.out.println("Bank Accounts are  full..!!!");
						System.exit(0);
				}
				break;
				
			case 3 :																														// done
				if(counter < bankAcc.length){
					System.out.println("Enter the bank Details:-   Name , Balance , Period of loan  ");
					bankAcc[counter] = new LoanAccount(sc.next(), sc.nextDouble(), sc.nextInt()) ; 
							counter++;
				}
				else {
					System.out.println("Bank Accounts are  full..!!!");
					System.exit(0);
				}
				break;
			
			
			case 4:																																// done
				System.out.println("Enter the account number and amount to be withdraw:--");
				int acc = sc.nextInt();    
				double amount = sc.nextDouble(); 
					for( BankAccounts  a : bankAcc){
						if(a != null){
								if(acc == a.getAccountNo())
									a.deposit(acc ,amount);                                     // if we want changes only in saingAccount((SavingAccount)a).withdraw(acc ,amount);
						}		
					}
				break;
			
			
			case 5:																																	//done
				System.out.println("Enter the account number and amount to be deposit:--");
				int ac = sc.nextInt();    
				double amt = sc.nextDouble(); 
					for( BankAccounts  a : bankAcc){
						if(a != null)
						{
								if(ac == a.getAccountNo())
									a.deposit(ac ,amt);                // if we want only savingAccount should change ((SavingAccount)a).deposit(acc ,amount);
						}
					}
				break;
				
			case 6:																										//done (to display)
				for(BankAccounts a : bankAcc){
					if(a != null)
						System.out.println(a);
				}
				break;
				
			case 7:																										// done
				System.out.println("Enter the number of years you want to set all accounts for emi:--");
				int years = sc.nextInt();
				for(BankAccounts b : bankAcc){
					if(b instanceof SavingsAccount) {
						((SavingsAccount)b).simpleInterest(years);
					}
				}
				break;
				
			case 8:																									//done
				System.out.println("Summery:-");
				for( BankAccounts a : bankAcc){
					if(a != null)
					System.out.println("acc no:- " + a.getAccountNo() + "    tax:-  " + a.computeTax());
				}
				break;
				
			case 9:																							// done
				for(BankAccounts b : bankAcc){
					if(b instanceof LoanAccount )
						System.out.println("Account Number:- " + b.getAccountNo() + " " + ((LoanAccount)b).getLoanDetails());
				}
				break;
			
			case 10:
				exit = true;
				break;
				
			default:
				System.out.println("Please, enter valid input");
				break;
			}		
		}
		sc.close();
	}
}
