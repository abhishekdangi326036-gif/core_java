package jdbcc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertion {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "root");
		System.out.println("Connection established");
		Statement stmt = con.createStatement();
		stmt.executeUpdate("insert into hospital values(1,'Ramesh','Hyd','Fever','Dr. Ravi')");
		stmt.executeUpdate("insert into hospital values(2,'Suresh','Hyd','Cold','Dr. Ravi')");
		stmt.executeUpdate("insert into hospital values(3,'Ramesh','Hyd','Fever','Dr. Ravi')");
		stmt.executeUpdate("insert into hospital values(4,'Ramesh','Hyd','Fever','Dr. Ravi')");
		stmt.executeUpdate("insert into hospital values(5,'Ramesh','Hyd','Fever','Dr. Ravi')");
		stmt.executeUpdate("insert into hospital values(6,'Ramesh','Hyd','Fever','Dr. Ravi')");
		stmt.executeUpdate("insert into hospital values(7,'Ramesh','Hyd','Fever','Dr. Ravi')");
		
		System.out.println("Data inserted");
		
	}

}
