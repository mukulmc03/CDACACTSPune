package day18Tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

import day18.Employee;
import day18.SalesManager;

public class EmployeeTester {

	public static void main(String[] args) {
		try{
			ArrayList<Employee> employeeArrayList = new ArrayList<Employee>(
					Arrays.asList(new Employee(), new Employee(), new Employee()));
			
			Vector<Employee> employeeVector = new Vector<Employee>(
					Arrays.asList(new SalesManager(), new SalesManager(), new SalesManager()));
			
			Collections.copy(employeeArrayList, employeeVector);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
