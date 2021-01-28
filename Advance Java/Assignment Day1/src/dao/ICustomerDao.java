package dao;

import java.sql.Date;
import java.sql.SQLException;


import pojos.Customer;

public interface ICustomerDao {
	Customer authenticateUser(String email, String password) throws SQLException;
	String addNewUser(double depositAmount, String email, String name, String password, Date registrationDate, String role) throws SQLException;
	String changePassword(String email, String oldPassword, String newPassword) throws SQLException;
	String unsubscribeCustomer(int id) throws SQLException;
}
