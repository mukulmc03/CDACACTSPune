//Swap two numbers

package eDACAssignments;

import java.util.*;

public class SwapTwoNum {
	static int a, b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		swap1();
		swap2();
		sc.close();
	}
	
	static void swap1() {
		System.out.println("Using third variable: ");
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Numbers after swapping: "+a+" "+b);
		System.out.println();
	}
	
	static void swap2() {
		System.out.println("Without using third variable: ");
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Numbers after swapping: "+a+" "+b);
	}
}
