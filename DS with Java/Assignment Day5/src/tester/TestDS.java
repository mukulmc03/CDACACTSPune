package tester;

import java.util.Scanner;

import doublyLinkedList.DoublyLinkedList;
import doublyLinkedList.DoublyLinkedListClass;

public class TestDS {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			//create new doubly linked list
			DoublyLinkedList dList = new DoublyLinkedListClass();
			boolean exit = false;
			
			while(!exit) {
				System.out.println("\nPlease, choose one option from the following : ");
				System.out.println("\t1. Add at front of the list\n\t"
						+ "2. Add at end of the list\n\t"
						+ "3. Print List\n\t"
						+ "4. Exit");
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Enter a number to add at the front : ");
					dList.addAtFront(sc.nextInt());
					break;
					
				case 2:
					System.out.println("Enter a number to add at the end : ");
					dList.addAtEnd(sc.nextInt());
					break;
					
				case 3:
					dList.printList();
					break;
				case 4:
					exit = true;
					break;
					
				default:
					System.out.println("Please, enter valid input!");
					break;
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
