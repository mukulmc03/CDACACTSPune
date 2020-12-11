package com.app.geometry;

import java.lang.Math;
 
public class Point2D{
	private double xc, yc;
	
	public Point2D(double x, double y){
			this.xc = x;
			this.yc = y;
		}

	public String getDetails(){
		return "X & Y Co-ordinates: " + xc + ", "  + yc;
	}

	public boolean isEqual(Point2D anotherPoint){
		if (this.xc == anotherPoint.xc && this.yc == anotherPoint.yc) 
			return true;
		else
			return false;
	}

	public Point2D createNewPoint(int xOff, int yOff){
		return new Point2D(xc + xOff, yc + yOff);
	}

    public String toString() {
        return "Point2D [xc=" + xc + ", yc=" + yc + "]";
    }

	public double calcDistance(Point2D p){
		double distance = Math.sqrt((this.xc - p.xc) * (this.xc - p.xc) + (this.yc - p.yc) * (this.yc - p.yc));
		return distance;
	}
		
	public static void main(String[] args) {
		Point2D p1 = new Point2D(2.5, 3.5);
		System.out.println(p1.getDetails());
		
		Point2D p2 = new Point2D(4, 5.8);
		System.out.println(p1.isEqual(p2));

		System.out.println(p1.calcDistance(p2));
		
		Point2D p3 = p1.createNewPoint(5, -2);
		System.out.println(p3);
	}
}