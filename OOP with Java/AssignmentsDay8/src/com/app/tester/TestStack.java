package com.app.tester;

import java.util.Arrays;
import java.util.Scanner;

import com.app.org.*;

public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StackInterface si = null;
		boolean exit = false;
		while(!exit)
		{
			System.out.println("\t1. Choose Fixed Stack\n\t2. Choose Growable Stack");
			System.out.println("\t3. Push data\n\t4. Pop data & display");
			System.out.println("\t5. EXIT");
			System.out.println("\tSelect the proper option : ");
			switch(sc.nextInt())
			{
			case 1 :
				if(si == null)
					si = new FixedStack();
				break;
				
			case 2 :
				if(si == null)
					si = new GrowableStack(); 
				break;
				
			case 3:
					if(si != null)
					{
						System.out.println("Enter the employee details like ID , NAME , SALARY...");
						   Employee e = new Employee(sc.nextInt(), sc.next() , sc.nextDouble() );
						si.push(e);
					}
				break;

			case 4:
				
				Employee e = si.pop();
				System.out.println("Data "+ e + "is Removed from the Stack");
				break;
				
			case 5 :
					exit = true ;
				break;
		
			}
		}	
		sc.close();
	}
}
