package com.app.tester;

import java.util.Scanner;

import com.app.org.*;

public class TestOrganization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		
		int counter = 0;

		System.out.println("Enter number of object you want to store:--");
		Emp [] employees = new Emp[sc.nextInt()];
		
		while(!exit) {
			System.out.println("Please, choose One option from the following: ");
			System.out.println("\t1. Hire Manager\n\t2. Hire Worker\n\t"
					+ "3. Display Information of all Employees\n\t4. Compute Net Salary\n\t5. Exit");
			switch(sc.nextInt()) {
			case 1:
				if(counter < employees.length) {
					System.out.println("Enter Manager ID, Manager Name, Manager Department ID, "
							+ "Manager Basic Salary, Manager Performance Bonus : ");
					int id = sc.nextInt();
					String name = sc.next();
					int deptID = sc.nextInt();
					double basic = sc.nextDouble();
					double perfBonus = sc.nextDouble();
					
					if(id <= employees.length) {
						employees[counter] = new Mgr(id, name, deptID, basic, perfBonus);
						counter ++;
					}
					else {
						System.out.println("Manager ID must be within Range");
					}
				}
				else {
					System.out.println("Array is Full");
				}
				break;
				
			case 2:
				if(counter < employees.length) {
					System.out.println("Enter Worker ID, Worker Name, Worker Department ID, "
							+ "Worker Basic Salary, Worker Hours Worked & Hourly Rate : ");
					int id = sc.nextInt();
					String name = sc.next();
					int deptID = sc.nextInt();
					double basic = sc.nextDouble();
					double hoursWorked = sc.nextDouble();
					double hourlyRate = sc.nextDouble();
					
					if(id <= employees.length) {
						employees[counter] = new Worker(id, name, deptID, basic, hoursWorked, hourlyRate);
						counter ++;
					}
					else {
						System.out.println("Worker ID must be within Range");
					}
				}
				else {
					System.out.println("Array is Full");
				}
				break;
				
			case 3:
				for(Emp emp : employees) { 
					if(emp != null) {
						System.out.println(emp);
					}
				}
				break;
				
			case 4:
				System.out.println("Enter the index to find Net Salary : ");
				int index = sc.nextInt();
				
				if(index <= counter){
					Emp temp = employees[index];
					if(temp instanceof Mgr)
						System.out.println("Net Salary is : " + ((Mgr)temp).computeNetSalary());
					else if(temp instanceof Worker)
						System.out.println("Net Salary is : " + ((Worker)temp).computeNetSalary());

				}
				else
					System.out.println("Please, provide correct index...");
			break;
				
			case 5:
				exit = true;
				break;
				
			default:
				System.out.println("Please, Enter Valid Input");
				break;
			}
		}
		sc.close();
	}

}
