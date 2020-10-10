//Check Armstrong number

package eDACAssignments;

import java.util.*;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to Find Armstrong Number: ");
		int num = sc.nextInt();
		
		int temp = num;
		int rem, sum = 0;
		while(num > 0) {
			rem = num % 10;
			sum = sum + (rem * rem * rem);
			num /= 10;
		}
		
		if(temp == sum) {
			System.out.println(+temp+" is Armstrong Number");
		}else {
			System.out.println(+temp+" is not an Armstrong Number");
		}
		sc.close();
	}

}
