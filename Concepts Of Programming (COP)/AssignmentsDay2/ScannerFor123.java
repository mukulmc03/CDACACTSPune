// 4. Use, java.util.Scanner class (1, 2, 3) assignments.

import java.util.Scanner;

class ScannerFor123{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please, enter two numbers to find Average");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Average = " +(a + b) / 2);

		System.out.println("Please, enter Principle, Rate and Years to find Simple Interest");
		float p = sc.nextFloat();
		float r = sc.nextFloat();
		float y = sc.nextFloat();

		System.out.println("Simple Interest = " +(p + r + y) / 100);

		System.out.println("Please, enter degree Celsius to convert into Farhenheit");
		float c = sc.nextFloat();

		System.out.println("Farhenheit = " +((9 * c / 5) + 32));
	}
}