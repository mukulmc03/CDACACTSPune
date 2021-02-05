package tester;
import static utils.HibernateUtils.getSf; 

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.*;

import dao.UserDaoImpl;
import pojos.Role;
import pojos.User;

//import static utils.HibernateUtils.getSf;
//import org.hibernate.*;
public class UserReg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(SessionFactory factory = getSf() ; Scanner sc = new Scanner(System.in)){
			System.out.println("Enter User details:-- name,  email,  password,  userRole,  confirmpassword,  regAmount ,  regDate");
			User u = new User(sc.next(), sc.next(), sc.next(), Role.valueOf(sc.next().toUpperCase()), sc.next(), sc.nextDouble(), LocalDate.parse(sc.next()));
			System.out.println("Reg Status ");
			UserDaoImpl userDao = new UserDaoImpl();
			userDao.registerUser(u);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
				
	}

}
