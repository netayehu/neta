package c;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadDemo3 {

	
		public static void main(String[] args) {
			String dbUrl="jdbc:mysql://localhost:3306/db?createDatabaseIfNotExist=true";
			String user= "root";
			String password="1234";
			
			
			try(Connection con=DriverManager.getConnection(dbUrl, user, password);) {
				String sql="select * from book";
				Statement stmt= con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				rs.next();
				rs.next();
				
				int id= rs.getInt(1);
				int autherId= rs.getInt(2);
				String title= rs.getString(3);
				Date publication = rs.getDate(4);
				double price = rs.getDouble(5);
				System.out.println("id: "+id+" autherId: "+autherId+" title: "+title);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			System.out.println("disconnected");

	}

}
