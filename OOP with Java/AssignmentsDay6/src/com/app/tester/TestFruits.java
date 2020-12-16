package com.app.tester;
import com.app.fruits.*;
import java.util.Scanner;
import com.app.utils.*;

public class TestFruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean exit = false;
		int counter = 0;
		
		System.out.println("How many Fruits to Add in Basket?");
		Fruits basket1[] = new Fruits[sc.nextInt()];
		
		while(!exit) {
		System.out.println("Choose one option from following Menu : ");
		System.out.println("\tMenu: \n\t1. Add Apple\n\t2. Add Orange\n\t3. Add Cherry\n\t4. Display taste of All "
				+ "Fruits in Basket\n\t5. Exit");
		
			switch(sc.nextInt()) {
			case 1:
				if(counter < basket1.length) {
					System.out.println("Enter Name of Apple : ");
					FruitUtils.addFruits(new Apple(sc.next()), basket1, counter);
					counter ++;
				}
				else {
					System.out.println("Basket is Full!");
					System.exit(0);
				}
				break;
				
			case 2:
				if(counter < basket1.length) {
					System.out.println("Enter Name of Orange : ");
					FruitUtils.addFruits(new Orange(sc.next()), basket1, counter);
					counter ++;
				}
				else {
					System.out.println("Basket is Full!");
					System.exit(0);
				}
				break;
				
			case 3:
				if(counter < basket1.length) {
					System.out.println("Enter Name of Cherry : ");
					FruitUtils.addFruits(new Cherry(sc.next()), basket1, counter);
					counter ++;
				}
				else {
					System.out.println("Basket is Full!");
					System.exit(0);
				}
				break;
				
			case 4:
				for(Fruits f :basket1 )
				{
					if(f!=null)
					f.taste();
				}
				break;
				
			case 5:
				exit = true;
				break;
				
			default:
				System.out.println("Please, enter valid Input");
				break;
			}
		}
		sc.close();
	}

}
