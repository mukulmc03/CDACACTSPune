package day18;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListOfIntegers {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			LinkedList<Integer> integerLinkedList = new LinkedList<Integer>();
			for(int i = 0; i < 10; i ++) {
				integerLinkedList.add(i);
			}
			System.out.println("List before Shuffling : " + integerLinkedList);
			Collections.shuffle(integerLinkedList);
			System.out.println("List after Shuffling : " + integerLinkedList);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
