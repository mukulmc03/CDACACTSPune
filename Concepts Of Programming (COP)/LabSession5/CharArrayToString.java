//Convert char Array to String

package eDACAssignments;

import java.util.Scanner;

public class CharArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of an Array");
		int size = sc.nextInt();
		
		char[] arr = new char[size];
		
		for(int i = 0; i < size; i ++) {
			arr[i] = sc.next().charAt(0);
		}
		
		String str = String.copyValueOf(arr);
		System.out.println("Char array converted into String is: " +str);
		sc.close();
	}

}
