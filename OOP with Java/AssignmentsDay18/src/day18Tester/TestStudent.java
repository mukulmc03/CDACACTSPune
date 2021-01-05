package day18Tester;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;
import day18.Student;
import day18.StudentRules;
import day18.Student.Course;

public class TestStudent {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			boolean exit = false;
			HashMap<String, Student> students = new HashMap<>();
			
			while(!exit) {
				System.out.println("Please, choose one option from the Menu : ");
				System.out.println(" \t1. Student Admission  \n\t2. Fetch Student Details By PRN  "
						+ "\n\t3. Display all student details   \n\t4. Update marks of a particular student."
						+ "\n\t5. Cancel Admission \n\t6. Display names of all students who have enrolled in a specific course \n\t10. EXIT ");
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Student Admission!");
					System.out.println("Please, enter Student Details : (PRN, Name, Course, Marks, Date of Birth(yyyy-mm-dd))");
					StudentRules.addStudent(sc.next(), sc.next(), Course.valueOf(sc.next().toUpperCase()), sc.nextDouble(), LocalDate.parse(sc.next()), students);
					System.out.println("Student Admitted Successfully!");
					break;
					
				case 2:
					System.out.println("Fetch Student details by PRN!");
					System.out.println("Please, enter PRN of the Student : ");
					StudentRules.fetchDetails(sc.next(), students);
					break;
					
				case 3:
					System.out.println("All Student details are : ");
					StudentRules.displayAllDetails(students);
					break;
					
				case 4:
					System.out.println("Update marks of a particular student!");
					System.out.println("Please, enter PRN of a Student : ");
					StudentRules.addNewMarks(sc.next(), sc.nextDouble(), students);
					break;
					
				case 5:
					System.out.println("Cancel Admission!");
					System.out.println("Please, enter PRN of a Student : ");
					StudentRules.cancelAdmission(sc.next(), students);
					System.out.println("Admission Canceled!");
					break;
					
				case 6:
					System.out.println("Enter course name of a Student: ");
					StudentRules.checkCourse(Course.valueOf(sc.next().toUpperCase()), students);
					
					break;
					
				case 10:
					exit = true;
					break;
					
				default: 
					System.out.println("Please, enter valid input!");
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
