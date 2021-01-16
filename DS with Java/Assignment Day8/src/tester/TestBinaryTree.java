package tester;

import java.util.Scanner;

import binaryTree.BinaryTree;

public class TestBinaryTree {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			BinaryTree newBT = new BinaryTree();
			newBT.createTree();
			boolean exit = false;
			
			while(!exit) {
				System.out.println("Choose one from the following : ");
				System.out.println("\t1. Pre-Order Traversal\n\t"
						+ "2. Post-order Traversal\n\t"
						+ "3. Exit\n");
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Pre-Order Traversal!");
					newBT.preOrder();
					break;
					
				case 2:
					System.out.println("Post-Order Traversal!");
					newBT.postOrder();
					break;
					
				case 3:
					System.out.println("Program Terminated!");
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
