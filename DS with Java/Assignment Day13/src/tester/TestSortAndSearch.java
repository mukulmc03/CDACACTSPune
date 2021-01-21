package tester;

import java.util.Scanner;

import searching.BinarySearch;
import searching.LinearSearch;
import sorting.BubbleSort;

public class TestSortAndSearch {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			boolean exit = false;
			int arr[];
			BubbleSort bubbleSor = new BubbleSort();
			LinearSearch linearSea = new LinearSearch();
			int location = -1;
			
			System.out.println("Please, enter size of an array");
			arr = new int[sc.nextInt()];
			System.out.println("Please, enter elements of an Array : ");
			for(int i = 0; i < arr.length; i ++) {
				arr[i] = sc.nextInt();
			}
			while(!exit) {
				System.out.println("Please, choose one from the following : ");
				System.out.println("\t"
						+ "1. Linear Search in an Array\n\t"
						+ "2. Bubble Sort an Array\n\t"
						+ "3. Binary Search in an Array\n\t"
						+ "4. Print Elements of Array\n\t"
						+ "5. Exit\n\t");
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Please, enter element you want to search using Linear Search : ");
					if(linearSea.linearSearch(arr, sc.nextInt()))
						System.out.println("Element found in Array!");
					else
						System.out.println("ELement not found in Array!");
					break;
					
				case 2:
					System.out.println("Sorted Array : "); 
					bubbleSor.bubbleSort(arr);
					break;
					
				case 3:
					bubbleSor.bubbleSort(arr);
					System.out.println("Please, enter element you want to search using Binary Search : ");
					location =  BinarySearch.binarySearch(arr, 0, arr.length - 1, sc.nextInt());  
				    if(location != -1)  
				    System.out.println("the location of the item is " + location);  
				    else   
				        System.out.println("Item not found");
					break;
					
				case 4:
					System.out.println("Elements of an Array : ");
					for(int i = 0; i < arr.length; i ++) {
						System.out.print(arr[i] + ", ");
					}
					break;
					
				case 5:
					System.out.println("Program Terminated!");
					exit = true;
					break;
					
				default:
					System.out.println("Please, enter valid Input!");
					break;
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
