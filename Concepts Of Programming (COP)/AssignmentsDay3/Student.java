/* 2. 
	Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. 
	Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student. */

class Student{
	String name;
	int rollNo;

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "John";
		s1.rollNo = 2;

		System.out.println(s1.rollNo);
		System.out.println(s1.name);	
	}
}