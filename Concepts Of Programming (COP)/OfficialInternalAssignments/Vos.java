package cOPOfficialInternalAssignment;

public class Vos {
	double radius;
	public Vos(double radius) {
		// TODO Auto-generated method stub
		this.radius = radius;
		double vol = 4 / 3 * (Math.PI * radius * radius * radius);
		System.out.println("Volume of Sphere is: " +vol);
	}
}
