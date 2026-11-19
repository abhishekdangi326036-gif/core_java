package laptop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertion {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "root");
		con.setAutoCommit(false);
		Statement stmt = con.createStatement();
		try {
			stmt.executeUpdate(
					"create table laptop(id int primary key, brand varchar(20),processor varchar(20),ram varchar(20),storage varchar(20))");
			stmt.executeUpdate("insert into laptop values(1,'Dell','i5','8GB','1TB')");
			stmt.executeUpdate("insert into laptop values(2,'HP','i7','16GB','512GB')");
			stmt.executeUpdate("insert into laptop values(3,'Lenovo','i5','8GB','1TB')");
			stmt.executeUpdate("insert into laptop values(4,'Asus','i7','16GB','1TB')");
			stmt.executeUpdate("insert into laptop values(5,'Acer','i3','4GB','500GB')");
			stmt.executeUpdate("insert into laptop values(6,'Apple','M1','8GB','256GB')");

			con.commit();

			System.out.println("Data inserted");
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
			con.rollback();
		} finally {
			con.close();
		}

	}

}