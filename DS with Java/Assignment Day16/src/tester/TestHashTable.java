package tester;

import java.util.Scanner;

import hashTable.*;

public class TestHashTable {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter size of Hash Table : ");
			HashTable ht = new HashTable(sc.nextInt());
			boolean exit = false;
			
			while(!exit) {
				System.out.println("Menu : ");
				System.out.println("\n\t1. Insert\n\t"
						+ "2. Remove\n\t"
						+ "3. Get\n\t"
						+ "4. Clear\n\t"
						+ "5. Size\n\t"
						+ "6. Exit");
				
				switch(sc.nextInt()) {
				case 1:
	                System.out.println("Enter key and value");
	                ht.insert(sc.next(), sc.nextInt() ); 
					break;
					
				case 2:
					System.out.println("Enter key you want ot remove : ");
					ht.remove(sc.next());
					break;
					
				case 3:
	                System.out.println("Enter key");
	                System.out.println("Value : "+ ht.get(sc.next())); 
	                break;                                   
					
				case 4:
	                ht.makeEmpty();
	                System.out.println("Hash Table Cleared\n");
					break;
					
				case 5:
					System.out.println("Size : "+ ht.getSize() );
					break;
					
				case 6:
					exit = true;
					System.out.println("Prgoram Terminated");
					break;
				
				default:
					System.out.println("Please, enter valid input!");
					break;
				}
			}
		}
	}

}
