package tester;

import java.sql.Date;
import java.util.Scanner;

import dao.CustomerDaoImpl;
import pojos.Customer;

public class TestCustomerDB {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			CustomerDaoImpl custDao = new CustomerDaoImpl();
			Customer customer = new Customer();
			boolean exit=false;
			while(!exit)
			{
				try {
					System.out.println("Menu : \n\t"
							+ "1. User Login \n\t"
							+ "2. New User Registration \n\t"
							+ "3. Change Password \n\t"
							+ "4. Un-Subscribe Customer\n\t"
							+ "5. Exit");
					switch (sc.nextInt()) {
					case 1: //user login
						System.out.println("Enter Email ID & Password : ");
						customer = custDao.authenticateUser(sc.next(), sc.next());
						if(customer != null) {
							System.out.println("Login Successfull!");
							System.out.println(customer);
						}
						else
							System.out.println("Login Unsuccessfull!");
						break;
						
					case 2:
						System.out.println("Enter Deposit Amount, Email, Name, Password, Registration Date & Role : ");
						System.out.println(custDao.addNewUser(sc.nextDouble(), sc.next(), sc.next(), sc.next(), Date.valueOf(sc.next()), sc.next()));
						break;
						
					case 3:
						System.out.println("Enter Email, Old Password, New Password : ");
						System.out.println(custDao.changePassword(sc.next(), sc.next(), sc.next()));
						break;

					case 4:
						System.out.println("Please, enter Customer ID : ");
						System.out.println(custDao.unsubscribeCustomer(sc.nextInt()));
						break;
						
					case 5 :
						exit = true;
						//clean up dao (to release DB resources)
						custDao.cleanUp();
						System.out.println("Program Terminated!");
						break;
					}
				}catch (Exception e) {
					System.out.println("Error : " + e);
					System.out.println("Please retry!");
				}
				sc.nextLine();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
