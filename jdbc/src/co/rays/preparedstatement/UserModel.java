package co.rays.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class UserModel {

    public int add(int id, String firstName, String lastName,
            String login, String password, Date dob)
            throws SQLException {

        Connection conn = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "root");

            conn.setAutoCommit(false);

            PreparedStatement pstmt = conn.prepareStatement(
                    "INSERT INTO SM_USER VALUES(?, ?, ?, ?, ?, ?)");

            pstmt.setInt(1, id);
            pstmt.setString(2, firstName);
            pstmt.setString(3, lastName);
            pstmt.setString(4, login);
            pstmt.setString(5, password);
            pstmt.setDate(6, new java.sql.Date(dob.getTime()));

            int i = pstmt.executeUpdate();

            conn.commit();

            System.out.println("Record inserted successfully");

        } catch (Exception e) {

            conn.rollback();
            e.printStackTrace();

        } finally {

            conn.close();
        }

        return id;
    }
    public int update(int id, String firstName, String lastName,
            String login, String password, Date dob)
            throws Exception {

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/neet", "root", "root");

            conn.setAutoCommit(false);

            pstmt = conn.prepareStatement(
                    "UPDATE SM_USER SET  firstName=?, lastName=?, login=?, password=?, dob=? WHERE id=?");

            pstmt.setString(1, firstName);
            pstmt.setString(2, lastName);
            pstmt.setString(3, login);
            pstmt.setString(4, password);
            pstmt.setDate(5, new java.sql.Date(dob.getTime()));
            pstmt.setInt(6, id);

            int i = pstmt.executeUpdate();

            conn.commit();

            System.out.println("Record updated successfully");

            return i;

        } catch (Exception e) {
            if (conn != null) {
                conn.rollback();
            }
            e.printStackTrace();

        } finally {
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        }

        return 0;
    }
    
    public void delete(int id) throws Exception {

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/neet", "root", "root");

            conn.setAutoCommit(false);

            pstmt = conn.prepareStatement(
                    "DELETE FROM SM_USER WHERE id=?");

            pstmt.setInt(1, id);

            int i = pstmt.executeUpdate();

            conn.commit();

            System.out.println("Record deleted successfully");

           

        } catch (Exception e) {
            if (conn != null) {
                conn.rollback();
            }
            e.printStackTrace();

        } finally {
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        }

    }
}
