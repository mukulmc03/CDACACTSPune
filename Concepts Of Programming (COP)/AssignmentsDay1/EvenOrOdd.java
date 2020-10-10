// 2. Write a program to check whether a given number is EVEN or ODD using Command Line Argument?

class EvenOrOdd{
	public static void main(String[] args) {
		float a = Float.parseFloat(args[0]);
		if(a % 2 == 0){
			System.out.print("Given Number is Even");
		}
		else{
			System.out.println("Given Number is Odd");
		}
	}
}