/* 4. Write a java program to convert temperature from celsius to fahrenheit, 
get input using Scanner ?
(C-0)/100 = (F-32)/180
C = (5/9)*(F-32)
F = (9*C/5) + 32 */

import java.util.*;

class ConvertCtoF{
	public static void main(String[] args) {
		float c, f;
		Scanner sc = new Scanner(System.in);

		System.out.println("Please, enter temperature in celsius");
		c = sc.nextFloat();

		f = (9 * c / 5) + 32;
		System.out.println("temperature in fahrenheit is " +f);

	}
}