package dao;

import java.sql.*;

import pojos.Customer;
import static utils.DBUtils.fetchDBConnection;

public class CustomerDaoImpl implements ICustomerDao {
	private Connection cn;
	private PreparedStatement pst1, pst2, pst3, pst4;
	
	public CustomerDaoImpl() throws ClassNotFoundException, SQLException {
		String sql1 = "select * from my_customers where email = ? and password = ?";
		String sql2 = "insert into my_customers values(default, ?, ?, ?, ?, ?, ?)";
		String sql3 = "update my_customers set password = ? where email = ? and password = ?";
		String sql4 = "delete from my_customers where id = ?";
		
		cn = fetchDBConnection();
		pst1 = cn.prepareStatement(sql1);
		pst2 = cn.prepareStatement(sql2);
		pst3 = cn.prepareStatement(sql3);
		pst4 = cn.prepareStatement(sql4);
		System.out.println("Customer Dao Created!");
	}
	
	@Override
	public Customer authenticateUser(String email, String password) throws SQLException {
		
		pst1.setString(1, email);
		pst1.setString(2, password);
		
		try(ResultSet rst = pst1.executeQuery()){
			if(rst.next())
				return new Customer(rst.getInt(1), rst.getDouble(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getDate(6), rst.getString(7));
		return null;
		}
	}
	
	@Override
	public String addNewUser(double depositAmount, String email, String name, String password, Date registrationDate,
			String role) throws SQLException {
		
		pst2.setDouble(1, depositAmount);
		pst2.setString(2, email);
		pst2.setString(3, name);
		pst2.setString(4, password);
		pst2.setDate(5, registrationDate);
		pst2.setString(6, role);
		
		//returns integer : number of rows updated/inserted
		pst2.executeUpdate();
		
		return "New Customer Added Successfully!";
	}
	
	@Override
	public String changePassword(String email, String oldPassword, String newPassword) throws SQLException {
		pst3.setString(2, email);
		pst3.setString(3, oldPassword);
		pst3.setString(1, newPassword);
		
		if(pst3.executeUpdate() > 0)
			return "Password Changed Successfully!";
		else
			return "Email ID or Password do not match!";
	}	

	
	
	@Override
	public String unsubscribeCustomer(int id) throws SQLException {
		pst4.setInt(1, id);
		
		if(pst4.executeUpdate() > 0)
			return "Customer unsubscribed successfully!";
		else
			return "Customer not registered!";
	}

	public void cleanUp() throws SQLException{
		if(pst1 != null)
			pst1.close();
		if(pst2 != null)
			pst2.close();
		if(pst3 != null)
			pst3.close();
		if(pst4 != null)
			pst4.close();
		if(cn != null)
			cn.close();
		System.out.println("Employee DAO Cleaned Up!");
	}
}
