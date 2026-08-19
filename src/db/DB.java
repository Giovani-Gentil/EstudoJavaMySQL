package db;


import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	public static Connection conectaDB() {
		Connection conn = null;
		try {
			String url = "jdbc:mysql://localhost:3306/coursejdbc?user=root&password=root";
			conn = DriverManager.getConnection(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	
}
