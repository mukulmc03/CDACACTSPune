//Sort strings in alphabetical order

package eDACAssignments;

import java.util.*;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp;
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter number of elements you want to enter: ");
		int count = sc.nextInt();
		
		String str[] = new String[count];
		
		
		System.out.println("Enter "+count+" Strings you want to sort");
		for(int i = 0; i < count; i ++) {
			str[i] = sc1.nextLine();
		}
		sc.close();
		sc1.close();
		
		for (int i = 0; i < count; i++){
			for (int j = i + 1; j < count; j++){ 
				if (str[i].compareTo(str[j])>0){
					temp = str[i];
	                str[i] = str[j];
	                str[j] = temp;
	            }
	         }
	    }
		System.out.print("Strings in Sorted Order:");
	    for (int i = 0; i <= count - 1; i++){
	        	System.out.print(str[i] + ", ");
	    }
	}
}
