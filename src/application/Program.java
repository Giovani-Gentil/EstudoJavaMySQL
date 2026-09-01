package application;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import db.DB;




public class Program {

	public static void main(String[] args) {
		Connection conn = DB.conectaDB();
		
//---------------------------------------------------------------------------------------------------------		
		//READ
//		Statement st = null;
//		ResultSet rs = null; 
		
//		try {
//			
//			st = conn.createStatement();
//			rs = st.executeQuery("SELECT * FROM DEPARTMENT");
//			
//			while (rs.next()) {
//				System.out.println(rs.getInt("Id") + ", " + rs.getString("Nome"));
//			}
			
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				rs.close();
//				st.close();
//				conn.close();
//				
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
		
//---------------------------------------------------------------------------------------------------------		
		
		// WRITE
//		PreparedStatement st = null;
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		
//		try {
//			st = conn.prepareStatement("INSERT INTO seller (Nome, Email, BirthDate, BaseSalary, DepartmentId) VALUES (?, ?, ?, ?, ?)");
//			st.setString(1, "Giovani");
//			st.setString(2, "giovani@gmail.com");
//			st.setDate(3, new java.sql.Date(sdf.parse("22/04/2004").getTime()));
//			st.setDouble(4, 3000.0);
//			st.setInt(5, 4);
//			
//			int rowsAffected = st.executeUpdate();
//			
//			System.out.println("Rows affected: " + rowsAffected);
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (ParseException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				st.close();
//				conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
		
//---------------------------------------------------------------------------------------------------------		
		
		// UPDATE
//		PreparedStatement st = null;
//		try {
//			st = conn.prepareStatement("UPDATE seller SET BaseSalary = BaseSalary + ? WHERE (DepartmentId = ?)");
//			
//			st.setDouble(1, 200.0);
//			st.setInt(2, 2);
//			
//			int rowsAffected = st.executeUpdate();
//			
//			System.out.println("Rows affected: " + rowsAffected);
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				st.close();
//				conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			
//		}
		
//---------------------------------------------------------------------------------------------------------		

		// DELETE
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("DELETE FROM seller WHERE Id = ?");
			st.setInt(1, 7);
			
			
			int rowsAffected = st.executeUpdate();
			
			System.out.println("Rows affected: " + rowsAffected);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				st.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
