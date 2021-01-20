package tester;

import java.util.Scanner;

import avlTree.AVLTreeClass;

public class TestAVLTree {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			boolean exit = false;
			AVLTreeClass avlTree = new AVLTreeClass();
			while(!exit) {
				System.out.println("Please, choose one from the following : ");
				System.out.println("\t1. Add element to AVL Tree\n\t"
						+ "2. Find Element in AVL Tree\n\t"
						+ "3. Print AVl Tree\n\t"
						+ "4. Exit");
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Enter element you want to insert : ");
					avlTree.root = avlTree.insertNode(avlTree.root, sc.nextInt());
					break;
					
				case 2:
					System.out.println("Enter element you want to find : ");
					if(avlTree.find(avlTree.root, sc.nextInt()))
						System.out.println("Element found in the list!");
					else
						System.out.println("Element not found in the list!");
					break;
					
				case 3:
					avlTree.printTree(avlTree.root, " ", true);
					break;
					
				case 4:
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
