package com.app.tester;

import com.app.geometry.*;
import java.util.*;

class TestPoint{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X & Y Co-ordinates of Point P1: ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();

		Point2D p1 = new Point2D(x1, y1);
		System.out.println(p1.getDetails());

		System.out.println("Enter X & Y Co-ordinates of Point P2: ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();

		Point2D p2 = new Point2D(x2, y2);
		System.out.println(p2.getDetails());

		System.out.println(p1.isEqual(p2));

		System.out.println("Enter offsets of P3: ");
		int xOff = sc.nextInt();
		int yOff = sc.nextInt();

		Point2D p3 = p1.createNewPoint(xOff, yOff);
		System.out.println(p3);

		System.out.println(p1.calcDistance(p2));
	}

}