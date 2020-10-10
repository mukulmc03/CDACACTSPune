//Find the factorial of a number

package eDACAssignments;

import java.util.Scanner;

public class FactOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to find Factorial: ");
		int num = sc.nextInt();
		int fact = 1;
		
		if(num == 1 & num == 2) {
			System.out.println("Factorial of "+num+" is: " +num);
		}else {
			for(int i = num; i >= 2; i --) {
				fact = fact * i;
			}
			System.out.println("Factorial of "+num+" is: " +fact);
		}
		
		sc.close();
	}

}
