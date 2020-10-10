/* 3. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units 
	  by creating a class named 'Triangle' */


class Triangle{
	double s1;
	double s2;
	double s3;
	double p;

	double getPerimeter(){
		double perimeter = s1 + s2 + s3;
		return perimeter;
	}

	double getArea(){
		p = (s1 + s2 + s3) / 2;
		return Math.sqrt((p * (p - s1) * (p - s2) * (p - s3)));
	}

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.s1 = 3;
		t1.s2 = 4;
		t1.s3 = 5;

		System.out.println("Area of Triangle is " + t1.getArea());
		System.out.println("Perimeter of Triangle is " + t1.getPerimeter());
	}
}