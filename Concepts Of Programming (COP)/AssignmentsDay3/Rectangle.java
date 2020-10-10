/* 1. Write a java class Rectangle with fields width & height. 
Create an instance method to calculate area of the rectangle.
Create another class having main to test area of rectangle. */

class Rectangle{
	double h, w;

double getArea(){
	double area = w * h;
	return area;
	}
}

class TestRect{
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.w = 10;
		r1.h = 15;

		System.out.println("Area of Rectangle is " + r1.getArea());
	}
}