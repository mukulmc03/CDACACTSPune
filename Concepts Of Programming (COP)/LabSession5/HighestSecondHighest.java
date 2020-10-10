//Find out the highest and second highest numbers in an array

package eDACAssignments;

import java.util.*;

public class HighestSecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sixe of Array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		for(int i = 0; i < size; i ++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < size ; i ++) {
			for(int j = i + 1; j < size; j ++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Highest Number in an Array is " +arr[size - 1]);
		System.out.println("Second Number in an Array is " +arr[size - 2]);
		sc.close();
	}

}
