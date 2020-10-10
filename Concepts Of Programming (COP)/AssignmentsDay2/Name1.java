//1. Use java.util.Scanner class to take "name" as input from User and print "Hello"+<name> on the console?  (String name = scan.next())

import java.util.Scanner;
class Name1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter your name");
		String name = sc.nextLine();
		System.out.println("Hello, "+ name);
	}
}