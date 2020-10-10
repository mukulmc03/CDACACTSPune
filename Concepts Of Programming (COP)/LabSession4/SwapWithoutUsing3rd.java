//Swap two variables without using the third variable

package eDACAssignments;

import java.util.*;

public class SwapWithoutUsing3rd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers you want to Swap: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("Numbers after Swapping are: " +a+ "," +b);
		
		sc.close();
	}

}
