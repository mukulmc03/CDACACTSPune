//To Calculate Compound Interest

package eDACAssignments;

import java.util.*;

public class CompoundInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int p, n, t;
		double a, ci, r;
		
		System.out.println("Enter Principal Amount: ");
		p = sc.nextInt();
		
		System.out.println("Enter no. of Years: ");
		t = sc.nextInt();
		
		System.out.println("Enter Rate of Interest: ");
		r = sc.nextDouble();
		
		System.out.println("Enter no. of times Interest is compounded per unit "+t+": ");
		n = sc.nextInt();
		
		a = p * Math.pow(1 + (r / n), n * t);
		ci = a - p;
		
		 System.out.println("Compound Interest after " + t + " years: "+ci);
	     System.out.println("Amount after " + t + " years: "+a);
	     
	     sc.close();
	}
}
