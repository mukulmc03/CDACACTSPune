/* 3. Write a java program to convert temperature from celsius to fahrenheit, get input from command line ?
(C-0)/100 = (F-32)/180
C = (5/9)*(F-32)
F = (9*C/5) + 32 */

class ConvertCtoF{
	public static void main(String[] args) {
		float c = Float.parseFloat(args[0]);
		float f = (9 * c / 5) + 32;
		System.out.println("Fahrenheit = " +f);
	}
}
