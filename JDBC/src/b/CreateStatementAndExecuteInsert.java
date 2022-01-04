package b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStatementAndExecuteInsert {

	public static void main(String[] args) {
		
		//to get a connection to the database:
		//1.database Url
		//2.user name
		//3.user password
		String dbUrl="jdbc:mysql://localhost:3306/db2?createDatabaseIfNotExist=true";
		String user= "root";
		String password="1234";
		
			String sql="insert into `person` values(102,'lea' )";
			
		
		
		//to get connection obj we need drivermanager
		try(Connection con=DriverManager.getConnection(dbUrl, user, password);) {
			// use the conneftion to get statement obj
			Statement stmt= con.createStatement();
			
			stmt.executeUpdate(sql);
			System.out.println(sql);
			
			System.out.println("connected");
		} catch (SQLException e) {
			
			System.out.println(sql);
			e.printStackTrace();
		}
		System.out.println("disconnected");
		

	}

}
