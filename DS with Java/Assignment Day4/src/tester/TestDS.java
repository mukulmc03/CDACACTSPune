package tester;

import java.util.Scanner;

import linkedList.LinkedListClass;
import linkedList.LinkedListInterface;

public class TestDS {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			LinkedListInterface list = new LinkedListClass();
			boolean exit = false;
			while(!exit) {
				System.out.println("Please, choose one from the following : ");
				System.out.println("\t1. Add number to front \n\t2. Print List \n\t3. Count number of elements/nodes of the list \n\t"
						+ "4. Frequency of element in the list\n\t5. Find a given number in the list \n\t6. Add number to the end\n\t"
						+ "7. Insert number to list so that list remains sorted\n\t8. Exit");
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Enter a no to add at front : ");
					list.addToFront(sc.nextInt());
					break;
					
				case 2:
					list.printList();
					break;
					
				case 3:
					System.out.println("Total elements : " + list.count());
					break;
					
				case 4:
					System.out.println("Enter a number to find it's frequency : ");
					System.out.println("Number Count : " + list.countFrequency(sc.nextInt()));
					break;
					
				case 5: 
					System.out.println("Enter a number you want to find : ");
					if(list.find(sc.nextInt()))
						System.out.println("Number found");
					else
						System.out.println("Number not found");
					break;
					
				case 6:
					System.out.println("Enter a number to add at the end of the list : ");
					list.addAtEnd(sc.nextInt());
					break;
					
				case 7:
					System.out.println("Enter a number so that list remains sorted : ");
					list.insert(sc.nextInt());
					break;
					
				case 8:
					exit = true;
					break;
					
				default:
					System.out.println("Please, enter valid input!");
					System.exit(0);
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
