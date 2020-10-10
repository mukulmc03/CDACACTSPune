//Reverse an array

package eDACAssignments;

import java.util.*;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of an Array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i = 0; i < size; i ++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array before reversing is: " +Arrays.toString(arr));
		
		int[] arr1 = new int[size];
		
		System.out.print("Array after reversing is: [");
		for(int i = size - 1; i >= 0; i--) {
			arr1[i] = arr[i];
			System.out.print(arr1[i] + " ");
		}
		System.out.println("]");
		sc.close();
	}
}
