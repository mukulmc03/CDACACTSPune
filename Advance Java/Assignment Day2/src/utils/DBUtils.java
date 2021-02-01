package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface DBUtils {
	static Connection fetchDBconnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/acts?useSSL=false";
		return DriverManager.getConnection(url, "root", "Rjaddu08!");
	}
}
