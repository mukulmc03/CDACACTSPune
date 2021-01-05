package day18;

import java.time.LocalDate;
import java.util.HashMap;
import day18.Student.Course;

public class StudentRules {
	public static void addStudent(String prn, String name, Course courseName, double marks, LocalDate birthDate, HashMap<String, Student> tempStudent)
		throws UserException{
		if(tempStudent.containsKey(prn))
			throw new UserException("Student Already Exists!");
		tempStudent.put(prn, new Student(prn, name, courseName, marks, birthDate));
		
		// or we can use putIfAbsent API
		// temp.putIfAbsent(prn,new Student(prn,course,name,marks,date)); public V
		// putIfAbsent(K key,V value) it returns current value if it exist
	}
	
	public static void fetchDetails(String prn, HashMap<String, Student> tempStudent) throws UserException {
		if(!tempStudent.containsKey(prn))
			throw new UserException("Student does not exists!");
		System.out.println("Student details are : " + tempStudent.get(prn));
	}
	
	public static void displayAllDetails(HashMap<String, Student> tempStudent) throws UserException{
		for(Student stud : tempStudent.values())
			System.out.println(stud);
		
		// public Collection<V> values() it returns collection, i.e. we have to convert it into collection list 
		// then iterate
		// System.out.println(temp); we can use direct toString but result will be messy			        
	}
	
	public static void addNewMarks(String prn, double marks, HashMap<String, Student> tempStudent) throws UserException{
		if(!tempStudent.containsKey(prn))
			throw new UserException("Student does not exists!");
		tempStudent.get(prn).setMarks(marks);
	}
	
	public static void cancelAdmission(String prn, HashMap<String, Student> tempStudent) throws UserException{
		if(!tempStudent.containsKey(prn))
			throw new UserException("Student does not exists!");
		tempStudent.remove(prn);
	}
	
	public static void checkCourse(Course courseName, HashMap<String, Student> tempStudent) throws UserException{
		if(tempStudent.getCourseName().equals(courseName.name()))
			System.out.println("Students having " + courseName + " course are : " + tempStudent.get(courseName));
		System.out.println(courseName.name());
	}
}
