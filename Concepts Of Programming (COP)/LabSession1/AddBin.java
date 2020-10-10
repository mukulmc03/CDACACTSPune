//Add two numbers/binary numbers/characters

package eDACAssignments;

import java.util.*; 

public class AddBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Operation you want to Perform\n\t"
				+ "1. Addition of Two Numbers\n\t2. Addition of Two Binary Numbers\n\t"
				+ "3. Addition of Characters");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("Enter two numbers");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Addition of two numbers is "+(a+b));
			
		}
		
		else if(choice == 2) {
		System.out.println("Enter two binary numbers");
		sc.nextLine();
		
		String b1 = sc.nextLine();
		String b2 = sc.nextLine();

		int a1 = Integer.parseInt(b1, 2);
		int a2 = Integer.parseInt(b2, 2);
		
		int sum = a1 + a2;
		
		String sumS = Integer.toBinaryString(sum);
		System.out.println(sumS);
		}
		
		else if(choice == 3) {
			System.out.println("Enter two characters/strings");
			String p = sc.nextLine();
			String q = sc.nextLine();
			
			System.out.println(p + q);
		}
		else {
			System.out.println("Please, enter a valid choice");
		}
		sc.close();
	}
}
