package tester;

import java.util.Scanner;

import directory.PhoneDirectory;

public class TestPhones {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			boolean exit = false;
			PhoneDirectory pd = new PhoneDirectory();
			
			while(!exit) {
				System.out.println("Choose one from the following : ");
				System.out.println("\t1. Add information about a user\n\t"
						+ "2. Delete user information\n\t"
						+ "3. Search a user based on phone number\n\t"
						+ "4. Search a user based on name\n\t"
						+ "5. Exit\n\t");
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Enter User's name : ");
					String name = sc.next();
					System.out.println("Enter User " + name + "'s Number and Address(city): ");
					pd.addNewEntry(name, sc.next(), sc.next());
					break;
					
				case 2:
					System.out.println("Enter User's name to delete information : ");
					pd.deleteEntry(sc.next());
					break;
					
				case 3:
					System.out.println("Enter User's number to search : ");
					System.out.println(pd.searchUsingNumber(sc.next()));
					break;
					
				case 4:
					System.out.println("Enter User's name to search : ");
					System.out.println(pd.numberFor(sc.next()));
					break;
					
				case 5:
					System.out.println("Exiting program!");
					exit = true;
					break;
					
				default:
					System.out.println("Invalid Input!");
					break;
				}
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
