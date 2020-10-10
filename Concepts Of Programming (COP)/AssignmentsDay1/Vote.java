/* 3. Write a program to enter the age of a person and check whether the person is eligible for voting or not 
	using Command Line Argument? */

class Vote{
	public static void main(String[] args) {
		int age = Integer.parseInt(args[0]);
		if (age >= 18){
			System.out.println("You are eligible to Vote");
		}
		else{
			System.out.println("You are not eligible to Vote");
		}
	}
}
