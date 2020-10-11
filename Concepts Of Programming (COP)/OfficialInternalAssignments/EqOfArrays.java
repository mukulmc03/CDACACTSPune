package cOPOfficialInternalAssignment;

import java.util.*;

public class EqOfArrays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean equal = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of 1st Array: ");
		int size1 = sc.nextInt();
		int[] arr1 = new int[size1];
		
		System.out.println("Enter elements of 1st Array: ");
		for(int i = 0 ; i < size1 ; i ++ ) {
			arr1[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("Enter size of 2nd Array: ");
		int size2 = sc.nextInt();
		int[] arr2 = new int[size2];
		
		System.out.println("Enter elements of 2nd Array: ");
		for(int i = 0 ; i < size2 ; i ++ ) {
			arr2[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr2));
		
		if(size1 == size2) {
			for(int i = 0 ; i < size1 ; i ++) {
				if(arr1[i] == arr2[i]) {
					equal = true;
				}
			}
		}else {
			equal = false;
		}
		
		if(equal) {
			System.out.println("Given Arrays are Equal");
		}else {
			System.out.println("Given Arrays are Not Equal");
		}
		sc.close();
	}

}
