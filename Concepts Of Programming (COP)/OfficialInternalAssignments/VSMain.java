package cOPOfficialInternalAssignment;

import java.util.*;

public class VSMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter Radius of Sphere: ");
		double radius = sc.nextDouble();
		
		Vos vs = new Vos();
		vs.Vos(radius);
		
		Sos ss = new Sos();
		ss.Sos(radius);
		
		sc.close();
	}

}
