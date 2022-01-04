package b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateJDBCConnection {

	public static void main(String[] args) {
		
		//to get a connection to the database:
		//1.database Url
		//2.user name
		//3.user password
		String dbUrl="jdbc:mysql://localhost:3306/db1?createDatabaseIfNotExist=true";
		String user= "root";
		String password="1234";
		
		//to get connection obj we need drivermanager
		try(Connection con=DriverManager.getConnection(dbUrl, user, password);) {
			System.out.println("connected");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		System.out.println("disconnected");
		

	}

}
