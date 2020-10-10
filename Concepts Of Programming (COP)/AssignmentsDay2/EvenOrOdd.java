// 6. Write a program to check whether a given number is EVEN or ODD ?

import java.util.*;

class EvenOrOdd{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		System.out.println("Please, enter a No.");
		int num = sc.nextInt();

		if (num % 2 == 0){
			System.out.println("Given No is EVEN");
		}
		else{
			System.out.println("Given No is ODD");
		}
	}
}