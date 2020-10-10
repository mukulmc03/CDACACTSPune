//Check if a number is palindrome or not

package eDACAssignments;

import java.util.*;

public class NoPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number to Check Pallindrome: ");
		int num = sc.nextInt();
		int rev = 0;
		
		int onum = num;
		while(num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		
		if(onum == rev) {
			System.out.println(+onum+" is Pallindrome");
		}else {
			System.out.println(+onum+" is not Pallindrome");
		}
		
		sc.close();
	}

}
