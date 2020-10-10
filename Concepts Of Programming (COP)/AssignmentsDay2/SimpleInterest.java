/* 3. Write a java program to calculate simple interest, get the required inputs 
	  from Scanner ?
   	  SI = (principal * rate * years)/100 */

import java.util.*;

class SimpleInterest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please, enter Principal amount");
		float p = sc.nextFloat();

		System.out.println("Please, enter Rate of Interest");
		float r = sc.nextFloat();

		System.out.println("Please, enter Number of Years");
		float y = sc.nextFloat();

		float si = (p * r * y) / 100;
		System.out.println("Simple Interest is " +si);
	}
}