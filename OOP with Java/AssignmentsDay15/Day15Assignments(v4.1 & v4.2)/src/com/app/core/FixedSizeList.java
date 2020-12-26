package com.app.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FixedSizeList {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			ArrayList<Integer> intArray = new ArrayList<Integer>(10);
			for(int i = 1; i <= 10; i ++)
				intArray.add(i);
			
			//Display using For - Each loop
			for(int intArr : intArray)
				System.out.println(intArr);
			
			//Display using Iterator
			Iterator<Integer> it = intArray.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
