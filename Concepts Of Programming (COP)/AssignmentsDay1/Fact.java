// 4. Write a program to calculate the factorial of the given number using Command Line Argument?

class Fact{
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int res = 1;
		if (num == 0 || num == 1){
			System.out.println("Factorial of Given Number is " +num);
		}
		else{
			for (int i = 2; i <= num ; i++ ) {
				res = res * i;
			}
			System.out.println("Factorial of Given Number is " +res);
		}
	}
}