package jdbcc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class exp {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//DRIVER LOADING
	Class.forName("com.mysql.cj.jdbc.Driver");
	//making connection
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "root");
	System.out.println("Connection established");
	
	//craeting statement
	
	Statement stmt = con.createStatement();
	
	stmt.executeUpdate("create table hospital(id int primary key, name varchar(20), address varchar(20), disease varchar(20), doctor varchar(20))");

	System.out.println("table created");	

}
}