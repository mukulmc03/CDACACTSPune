//Calculate area of rectangle

package eDACAssignments;

import java.util.*;

public class AreaOfRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and width of Rectangle: ");
		int l = sc.nextInt();
		int b = sc.nextInt();
		
		int area = l * b;
		System.out.println("Area of Rectangle is: " +area);
		sc.close();
	}
}
