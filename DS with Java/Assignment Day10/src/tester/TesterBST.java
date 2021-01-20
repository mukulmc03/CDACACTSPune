package tester;

import java.util.Scanner;

import binarySearchTree.BinarySearchTreeClass;

public class TesterBST {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			boolean exit = false;
			BinarySearchTreeClass bST = new BinarySearchTreeClass();
			while(!exit) {
				System.out.println("Please, choose one from the following : ");
				System.out.println("\t1. Insert element in BST\n\t"
						+ "2. Find element in BST\n\t"
						+ "3. Print BST\n\t"
						+ "4. Delete an element!\n\t"
						+ "5. Exit");
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Please, enter element you want to insert : ");
					bST.insert(sc.nextInt());
					break;
					
				case 2:
					System.out.println("Please, enter element you want to find : ");
					if(bST.find(sc.nextInt()))
						System.out.println("Element found in BST!");
					else
						System.out.println("Element not found in BST!");
					break;
					
				case 3:
					System.out.println("BST (in-Order) : ");
					bST.print();
					break;
					
				case 4:
					System.out.println("Deleting an Element!");
					System.out.println("Please, enter element you want to deete!");
					bST.delete(sc.nextInt());
					break;
					
				case 5:
					System.out.println("Program terminated!");
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
