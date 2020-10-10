//Java program to find ASCII value of a character

/**
 * 
 */
package eDACAssignments;

import java.util.*;
/**
 * @author mukulmc03
 *
 */
public class AsciiCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);
	    int asciiCode = ch;
	    // type casting char as int
	    int asciiValue = (int)ch;

	    System.out.println("ASCII value of "+ch+" is: " + asciiCode);
	    System.out.println("ASCII value of "+ch+" is: " + asciiValue);
	    sc.close();
	}

}
