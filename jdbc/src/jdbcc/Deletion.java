package jdbcc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Deletion {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "root");
		System.out.println("Connection established");
		Statement stmt = con.createStatement();
		stmt.executeUpdate("delete from hospital where id=1");
		
		System.out.println("Data deleted");
		

}
}