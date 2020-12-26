package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import com.app.core.Department;
import com.app.core.Emp;

import custom_exceptions.EmpHandlingException;

public class EmpValidationConstraints {

	public static LocalDate validJoinDate;
	static {
		validJoinDate = LocalDate.now().plusYears(1);
		System.out.println("valid join date " + validJoinDate);
	}

	public static Emp validateEmpDetails(ArrayList<Emp> emps, int id, String name, double salary, String joinDate,
			String dept) throws EmpHandlingException, ParseException {
		validateName(name);
		LocalDate date = parseNValidateDate(joinDate);
		checkForDup(id, name, emps);
		Department department = validateDepartment(dept);
		return new Emp(id, name, salary, date, department);
	}

	public static String validateName(String name) throws EmpHandlingException {
		if (name.length() < 3)
			throw new EmpHandlingException("Name invalid !!!!!!!!!!");
		return name;
	}

	public static LocalDate parseNValidateDate(String joinDate) throws ParseException, EmpHandlingException {

		// validation rule : join date should not be after valid date
		LocalDate d1 = LocalDate.parse(joinDate);//yyyy-MM-dd
		if (d1.isAfter(validJoinDate))
			throw new EmpHandlingException("Invalid join date.....");
		return d1;// rets parsed n validated join date to the caller.
	}

	// sample validation constraint on AdharCard : location must contain state code
	// as MH
	public static String validateAdharCardLocation(String location) throws EmpHandlingException {
		if (!location.contains("MH"))
			throw new EmpHandlingException("Invalid Adhar Card Location!!!!!");
		return location;
	}

	// check for duplicates
	public static void checkForDup(int id, String name, ArrayList<Emp> emps) throws EmpHandlingException {
		Emp e = new Emp(id, name);
		if (emps.contains(e))
			throw new EmpHandlingException("Dup Emp details detected!!!!!");
	}

	public static Department validateDepartment(String dept) {
		return Department.valueOf(dept.toUpperCase());
	}

	public static LocalDate parseDate(String date) throws ParseException, EmpHandlingException {

		return LocalDate.parse(date);
	}

}
