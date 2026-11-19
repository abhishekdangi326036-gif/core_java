package co.in.rays.prepared;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.Connection;

public class Marksheet {

	public int add(UserBean bean) throws Exception {

		Connection conn = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ps", "root", "root");

			conn.setAutoCommit(false);

			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO marksheet VALUES(?,?,?,?,?,?)");

			pstmt.setInt(1, bean.getId());
			pstmt.setInt(2, bean.getRoll_no());
			pstmt.setString(3, bean.getName());
			pstmt.setInt(4, bean.getPhy());
			pstmt.setInt(5, bean.getChe());
			pstmt.setInt(6, bean.getMath());

			int i = pstmt.executeUpdate();

			conn.commit();
			System.out.println("Record inserted successfully");
		} catch (Exception e) {

			conn.rollback();
			e.printStackTrace();
		} finally {

			conn.close();
		}
		return bean.getId();

	}

	public void delete(int id) throws Exception {

		Connection conn = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ps", "root", "root");

			conn.setAutoCommit(false);

			PreparedStatement pstmt = conn.prepareStatement("delete from marksheet where id = ? ");

			pstmt.setInt(1, id);

			int i = pstmt.executeUpdate();

			conn.commit();
			System.out.println("Record deleted successfully");
		} catch (Exception e) {

			conn.rollback();
			e.printStackTrace();
		} finally {

			conn.close();

		}
	}

	public void update(UserBean bean) throws Exception {

		Connection conn = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ps", "root", "root");

			conn.setAutoCommit(false);

			PreparedStatement pstmt = conn.prepareStatement(
					"UPDATE marksheet SET  roll_no = ?, name = ?, phy = ?, che =?, math=? WHERE id=?");

			pstmt.setInt(1, bean.getRoll_no());
			pstmt.setString(2, bean.getName());
			pstmt.setInt(3, bean.getPhy());
			pstmt.setInt(4, bean.getChe());
			pstmt.setInt(5, bean.getMath());
			pstmt.setInt(6, bean.getId());

			int i = pstmt.executeUpdate();

			conn.commit();
			System.out.println("Record update successfully");
		} catch (Exception e) {

			conn.rollback();
			e.printStackTrace();
		} finally {

			conn.close();
		}

	}

}
