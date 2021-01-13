package tester;

import java.util.Scanner;

import queue.QueueUsingLinkedList;
import stack.StackUsingLinkedList;

public class StackAndArrayUsingLinkedListTester {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			boolean exit = false;
			while(!exit) {
				System.out.println("Please, choose one Data Structure from the following : ");
				System.out.println("\t1. Stack \n\t"
						+ "2. Queue \n\t"
						+ "3. Exit");
				switch(sc.nextInt()){
					case 1:
						System.out.println("You chose Stack!");
						StackUsingLinkedList stack = new StackUsingLinkedList();
						boolean stackExit = false;
						
						while(!stackExit) {
							System.out.println("Please, choose one operation from the following : ");
							System.out.println("\t1. Push\n\t"
									+ "2. Pop\n\t"
									+ "3. Display Stack Elements \n\t"
									+ "4. Exit");
							switch(sc.nextInt()){
							case 1:
								System.out.println("You chose Push!");
								System.out.println("Enter element to Push : ");
								stack.push(sc.nextInt());
								break;
								
							case 2:
								System.out.println("You chose Pop!");
								stack.pop();
								break;
								
							case 3:
								stack.display();
								break;
								
							case 4:
								System.out.println("Exiting from Stack...");
								stackExit = true;
								break;
								
							default:
								System.out.println("Please, enter valid input!");
								System.exit(0);
								break;
							}
						}
						break;
	
					case 2:
						System.out.println("You chose Queue!");
						QueueUsingLinkedList queue = new QueueUsingLinkedList();
						boolean queueExit = false;
						
						while(!queueExit) {
							System.out.println("Please, choose one operation from the following : ");
							System.out.println("\t1. EnQueue\n\t"
									+ "2. DeQueue\n\t"
									+ "3. Display Queue Elements \n\t"
									+ "4. Exit");
							switch(sc.nextInt()){
							case 1:
								System.out.println("You chose EnQueue!");
								System.out.println("Enter the value you want to add to the Queue : ");
								queue.enQueue(sc.nextInt());
								break;
								
							case 2:
								System.out.println("You chose DeQueue!");
								queue.deQueue();
								break;
								
							case 3:
								queue.display();
								break;
								
							case 4:
								System.out.println("Exiting from Queue...");
								queueExit = true;
								break;
								
							default:
								System.out.println("Please, enter valid input!");
								System.exit(0);
								break;
							}
						}
						break;
		
					case 3:
						System.out.println("Exiting...");
						exit = true;
						break;
	
					default:
						System.out.println("Please, enter valid input!");
						System.exit(0);
						break;
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
