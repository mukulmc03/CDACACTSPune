package com.app.core;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LocalDateArray {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
		
			Boolean exit = false;
			ArrayList<LocalDate> dateArray = new ArrayList<LocalDate>();
			while(!exit) {
				System.out.println("1. Local Date Array \n2. Display Dates in ascending Array\n3. Quit");
				switch(sc.next()) {
				case "1":
					System.out.println("\tPlease, enter registration date(yyyy-mm-dd) : ");
					dateArray.add(LocalDate.parse(sc.next()));
					break;
					
				case "2":
					Collections.sort(dateArray);
					System.out.println(dateArray);
					break;
					
				case "Quit":
					exit = true;
					break;
					
				default:
					System.out.println("Invalid Input!");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
