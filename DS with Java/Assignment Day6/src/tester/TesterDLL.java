package tester;

import java.util.Scanner;

import doublyLinkedList.MyDLL; 

public class TesterDLL  {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyDLL list = new MyDLL();
		
		
		try {
		while (true) {
			System.out.println("****** DOUBLY LIKED LIST *********\n"
					+ "1.Add Element at Front\n"
					+ "2.Add at End\n"
					+ "3.Display the Elements\n"
					+ "4.Add Element in Sorting way\n"
					+ "5.Delete All Node Of Number (ALL NODE HAVING THAT NUMBER)\n"
					+ "6.Delete Single Node Number (SINGLE NODE HAVING THAT NUMBER)\n"
					+ "10.Exit");
			switch (sc.nextInt())
			{
			case 1:
				System.out.println("Enter the number you want to add in SLL");
				list.addAtFront(sc.nextInt());
				break;
			case 2:
				System.out.println("Enter the number you want to add in SLL At Last");
				list.addAtEnd(sc.nextInt());
				break;
			case 3:
				System.out.println("Linked List Is:- ");
				list.displayList();
				break;
			case 4:
				System.out.println("Enter the number you want to add in SLL In Middle");
				list.addBySorting(sc.nextInt());
				break;
			case 5:
				System.out.println("Enter the number you want to remove from list (ALL NODE OF THAT NUMBER)");
				list.deleteAll(sc.nextInt());
				break;
			case 6:
				System.out.println("Enter the number you want to remove from list (ONLY ONE NODE)");
				list.deleteSingle(sc.nextInt());
				break;
			case 10:
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Enter the correct choice");
				break;

			}
			
			
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}







