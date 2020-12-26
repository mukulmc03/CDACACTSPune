package utils;

import java.util.ArrayList;

import com.app.core.Emp;

import custom_exceptions.EmpHandlingException;

public class CollectionUtils {
//add a static method to accept emp PK details 
	// rets : emp ref , in case of success or throw exc.
	public static Emp checkIfExists(ArrayList<Emp> empList, int id, String name) throws EmpHandlingException {
		Emp e = new Emp(id, name);
		int index = empList.indexOf(e);
		if (index == -1)
			throw new EmpHandlingException("Invalid Emp credentials!!!!!");
		return empList.get(index);
	}
	//write a static method to generate some sample emp data
}
