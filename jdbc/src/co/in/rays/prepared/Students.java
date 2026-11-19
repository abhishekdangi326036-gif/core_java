package co.in.rays.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Students {

	public int add(StudentsBean bean) throws Exception{

		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/indore", "root", "root");

			conn.setAutoCommit(false);

			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO students VALUES(?,?,?,?,?)");

			pstmt.setInt(1, bean.getStudentId());
			pstmt.setString(2, bean.getName());
			pstmt.setString(3, bean.getEmail());
			pstmt.setInt(4, bean.getAge());
			pstmt.setString(5, bean.getCourse());

			int i = pstmt.executeUpdate();

			conn.commit();
			System.out.println("Record inserted successfully");

		} catch (Exception e) {

			conn.rollback();
			e.printStackTrace();
		} finally {

			conn.close();
		}
		return bean.getStudentId();

	}
	}