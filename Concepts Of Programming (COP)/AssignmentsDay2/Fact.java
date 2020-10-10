// 8. Write a program to calculate the factorial of the given number?

import java.util.*;

class Fact{
	public static void main(String[] args) {
		int res = 1;
		Scanner sc = new Scanner(System.in);

		System.out.println("Please, enter a number");
		int num = sc.nextInt();

		if(num == 1 || num == 0){
			System.out.println("Factorial of Given Number is " +num);
		}
		else{
			for (int i = 2; i <= num ; i++) {
				res = res * i;
			}
			System.out.println("Factorial of Given Number is " +res);
		}
	}
}