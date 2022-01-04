package c;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadDemo {

	public static void main(String[] args) {
		String dbUrl="jdbc:mysql://localhost:3306/db2?createDatabaseIfNotExist=true";
		String user= "root";
		String password="1234";
		
		
		try(Connection con=DriverManager.getConnection(dbUrl, user, password);) {
			String sql="select * from person";
			Statement stmt= con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			rs.next();
			
			int id= rs.getInt(1);
			
			String name= rs.getString(2);
			System.out.println("id: "+id+"name: "+name);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		System.out.println("disconnected");
	}

}
