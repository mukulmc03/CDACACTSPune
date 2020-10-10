//Sort an array in ascending order

package eDACAssignments;

import java.util.Arrays;
import java.util.Scanner;

public class SortAnArrayInAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of an Array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i = 0; i < size; i ++) {
			arr[i] = sc.nextInt();
		}
			System.out.println("Array before sorting is: " +Arrays.toString(arr));
		
		for(int i = 0; i < size; i ++) {
			for(int j = i + 1; j < size; j ++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Array after sorting is: " +Arrays.toString(arr));
		sc.close();
	}

}
