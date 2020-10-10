//Print Fibonacci series till n

package eDACAssignments;

import java.util.*;

public class FibTillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter a Number to find Fibonacci Series: ");
		int n = sc.nextInt();
		int a = 0, b = 1, c;
		
		if(n == 0) {
			System.out.println("Fibonacci Series till "+n+" is: "+n);
		}else {
			System.out.println("Fibonacci Series till "+n+" is: ");
			for(int i = 1; i <= n; i ++) {
				c = a + b;
				a = b;
				b = c;
				System.out.println(c);
			}
		}
		sc.close();
	}
}
