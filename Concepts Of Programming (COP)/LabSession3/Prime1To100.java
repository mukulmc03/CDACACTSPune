//Display prime numbers between 1 and 100 or 1 and n

package eDACAssignments;

import java.util.*;

public class Prime1To100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Lower Limit: ");
		int lower = sc.nextInt();
				
		System.out.println("Enter Upper Limit: ");
		int upper = sc.nextInt();	
		
		System.out.println("Prime Numbers between " +lower+" and "+upper+": ");
		int prime = 0;
		for(int i = lower; i <= upper; i ++) {
			for(int j = 2; j < i; j ++) {
				if(i % j == 0) {
					prime = 0;
					break;
				}
				else {
					prime = 1;
				}
			}
			if(prime == 1) {
				System.out.println(i);
				}
			}
		sc.close();
	}
}
