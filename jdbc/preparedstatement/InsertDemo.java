package src.jdbc.preparedstatement;

import java.sql.*;

public class InsertDemo {
    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost:3306/STUDENTS";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "root");
            String query = "INSERT into employee values (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, 6);
            ps.setString(2, "test");
            ps.setString(3, "test address");
            int result = ps.executeUpdate();
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

    }
}
