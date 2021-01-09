package tester;

import java.util.Scanner;

import circularQueue.CircularQueueClass;
import stack.StackClass;
import queue.QueueClass;

public class testDS {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			boolean exit = false;
			while(!exit) {
				System.out.println("Please, choose one Data Structure from the following : ");
				System.out.println("\t1. Stack \n\t2. Queue \n\t3. Circular Queue \n\t4. Exit");
				switch(sc.nextInt()){
					case 1:
						System.out.println("You chose Stack!");
						System.out.println("Enter size of the Stack : ");
						int stackSize = sc.nextInt();
						StackClass stack = new StackClass(stackSize);
						boolean stackExit = false;
						
						while(!stackExit) {
							System.out.println("Please, choose one operation from the following : ");
							System.out.println("\t1. Push\n\t2. Pop\n\t3. Display Stack Elements \n\t4. Display Stack elements in reversed order \n\t5. Exit");
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
								stack.reversedDisplay();
								break;
								
							case 5:
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
						System.out.println("Enter size of the Queue : ");
						int queueSize = sc.nextInt();
						QueueClass queue = new QueueClass(queueSize);
						boolean queueExit = false;
						
						while(!queueExit) {
							System.out.println("Please, choose one operation from the following : ");
							System.out.println("\t1. EnQueue\n\t2. DeQueue\n\t3. Display Queue Elements \n\t4. Exit");
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
						System.out.println("You chose Circular Queue!");
						System.out.println("Enter size of the Circular Queue : ");
						int circularQueueSize = sc.nextInt();
						CircularQueueClass circularQueue = new CircularQueueClass(circularQueueSize);
						boolean circularQueueExit = false;
						while(!circularQueueExit) {
							System.out.println("Please, choose one operation from the following : ");
							System.out.println("\t1. EnQueue\n\t2. DeQueue\n\t3. Display Circular Queue Elements \n\t4. Exit");
							switch(sc.nextInt()){
							case 1:
								System.out.println("You chose Circular EnQueue!");
								System.out.println("Enter the value you want to add : ");
								circularQueue.enQueue(sc.nextInt());
								break;
								
							case 2:
								System.out.println("You chose DeQueue!");
								circularQueue.deQueue();
								break;
								
							case 3:
								circularQueue.display();
								break;
								
							case 4:
								System.out.println("Exiting from Circular Queue...");
								circularQueueExit = true;
								break;
								
							default:
								System.out.println("Please, enter valid input!");
								System.exit(0);
								break;
							}
						}
						break;
	
					case 4:
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
