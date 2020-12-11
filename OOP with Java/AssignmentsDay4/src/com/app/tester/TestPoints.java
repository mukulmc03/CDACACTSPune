package com.app.tester;

import java.util.Scanner;

import com.app.geometry.*;

public class TestPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("How many points to plot?");
		Point2D pt[] = new Point2D[sc.nextInt()];
		int co = 1, count = 0;
		boolean exit = false;
		for(int i = 0; i < pt.length; i ++) {
			System.out.println("Enter coordinates of point " + co + " : ");
			pt[i]= new Point2D(sc.nextDouble(), sc.nextDouble());
			co ++;
		}
		while(!exit) {
			System.out.println("Choose a option Number from following Menu : ");
			System.out.println("\t1. Plot  a new Point.\n\t2. Display all points plotted so far."
					+ "\n\t3. Calculate distance.\n\t4. Exit");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				if(count < pt.length) {
					System.out.println("Enter index of array at which you want to add the point and "
							+ "X & Y co-ordinates of that point  : ");
					int index = sc.nextInt(); double xCoordinate = sc.nextDouble(), yCoordinate = sc.nextDouble();
					
					if(index < pt.length) {
						count ++;
						pt[index] = new Point2D(xCoordinate, yCoordinate);
					}
					else
						System.out.println("Provide index value within the array range");
				}
				else
					System.out.println("Array is Full... All points are plotted");
				break;	
							
			case 2:
				for(Point2D pts : pt)
					if(pts != null)
						System.out.println(pts.getDetails());
				break;
				
			case 3:
				System.out.println("Enter Start & End point indexes of Array: ");
				System.out.println(pt[sc.nextInt()].calcDistance(pt[sc.nextInt()]));
				break;
				
			case 4:
				exit = true;
				break;
				
			default:
				System.out.println("Invalid Input");
				System.exit(0);
			}
		}
		sc.close();
	}

}
