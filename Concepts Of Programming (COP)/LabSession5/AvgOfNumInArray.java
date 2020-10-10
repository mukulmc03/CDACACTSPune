//Calculate average of numbers using Array

package eDACAssignments;

import java.util.*;

public class AvgOfNumInArray {
	static int avg, sum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of an Array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i = 0; i < size; i ++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			avg = sum / size;
		}
		System.out.println("Average of Numbers in Array is: " + avg);
		
		sc.close();
	}
}
