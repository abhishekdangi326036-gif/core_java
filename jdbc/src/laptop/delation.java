package laptop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class delation {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "root");
		con.setAutoCommit(false);
		Statement stmt = con.createStatement();
		try {
			stmt.executeUpdate("delete from laptop where id=1");
			
			con.commit();
			
			System.out.println("Data deleted");
			
		}
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
			con.rollback();
		}
		finally {
			con.close();
		}
		
	}
	}
