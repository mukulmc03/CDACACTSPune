/* 5. Write a program to calculate the monthly salary of an employee : 
	take input for basic salary,
	HRA is 40% of basic salary,
	PF amount to be deducted is 12% of basic,
	Medical allowance is Rs 1200 per month, 
	Traveling allowance is Rs 800 per month,
	Professional tax to be deducted is Rs 300. */

	import java.util.Scanner;
	class MonthlySal{
		public static void main(String[] args) {
		
			System.out.println("Please, input your Basic Salary");
			Scanner sc = new Scanner(System.in);
			float sal = sc.nextFloat();

			float hra = (40 / 100) * sal;
			float pf = (12 / 100) * sal;
			float ma = 1200;
			float ta = 800;
			float pt = 300;

			float total = sal + hra - pf + ma + ta - pt;
			System.out.println("Total salary is " +total);
		}
	}