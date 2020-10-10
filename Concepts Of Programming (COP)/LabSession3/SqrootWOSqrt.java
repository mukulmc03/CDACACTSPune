//Find square root of a number without sqrt method

package eDACAssignments;

import java.util.*;

public class SqrootWOSqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to find Square Root: ");
		int num = sc.nextInt();
		
		double temp;
		double sqRoot = num / 2;
		do {
			temp = sqRoot;
			sqRoot = (temp + (num / temp)) / 2;  //sqrtn+1=(sqrtn+(num/sqrtn))/2.0 
		} while ((temp - sqRoot) != 0);
		
		System.out.println("Square root of "+ num+ " is: "+sqRoot);
		
		sc.close();
	}
}
