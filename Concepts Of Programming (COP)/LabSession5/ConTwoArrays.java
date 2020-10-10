//Concatenate two arrays

package eDACAssignments;

import java.util.*;

public class ConTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of 1st Array: ");
		int size1 = sc.nextInt();
		
		int[] arr1 = new int[size1];
		
		System.out.println("Enter elements of 1st Array: ");
		for(int i = 0; i < size1; i ++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter size of 2nd Array: ");
		int size2 = sc.nextInt();
		
		int[] arr2 = new int[size2];
		
		System.out.println("Enter elements of 2nd Array: ");
		for(int i = 0; i < size2; i ++) {
			arr2[i] = sc.nextInt();
		}
		
		int size3 = size1 + size2;
		int[] arr3 = new int[size3];
		int position = 0;
		
		for (int element : arr1) //copying elements of secondArray using for-each loop  
		{  
		arr3[position] = element;  
		position++;              //increases position by 1  
		}  
		
		for (int element : arr2) //copying elements of firstArray using for-each loop  
		{  
		arr3[position] = element;  
		position++;  
		}  
		System.out.println("Arrays after Concatination: "+Arrays.toString(arr3));
		sc.close();
	}

}
