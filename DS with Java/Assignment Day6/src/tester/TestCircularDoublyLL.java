package tester;

import java.util.Scanner;

import circularDoublyLinkedList.CircularDoublyLinkedListClass;

public class TestCircularDoublyLL {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			boolean exit = false;
			CircularDoublyLinkedListClass cDList = new CircularDoublyLinkedListClass();
			while(!exit) {
				System.out.println("Please, choose operation you want to perform on Circular Doubly Linked List : ");
				System.out.println("\t1. Insert Number \n\t"
						+ "2. Delete Number\n\t"
						+ "3. Display List\n\t"
						+ "4. Exit");
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Enter a number you want to add to the list : ");
					cDList.insert(sc.nextInt());
					break;

				case 2:
					System.out.println("Enter a number you want to delete from the list : ");
					cDList.delete(sc.nextInt());
					break;

				case 3:
					cDList.printList();
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
