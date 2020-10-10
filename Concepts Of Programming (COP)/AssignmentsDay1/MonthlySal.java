/* 1. Write a program to calculate the monthly salary of an employee : 
	take input for basic salary,
	HRA is 40% of basic salary,
	PF amount to be deducted is 12% of basic,
	Medical allowance is Rs 1200 per month, 
	Traveling allowance is Rs 800 per month,
	Professional tax to be deducted is Rs 300 using Command Line Argument */

	class MonthlySal{
		public static void main(String[] args) {
			double basic = Float.parseFloat(args[0]);
			double hra = 0.4 * basic;
			double pf = 0.12 * basic;
			double ma = 1200;
			double ta = 800;
			double proft = 300;
			double totSal = basic + hra - pf + ma + ta -proft;
			System.out.println("Total Monthly Salary is " +totSal);
		}
	}