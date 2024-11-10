package src.jdbc;

import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost:3306/STUDENTS";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "root");
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from employee where id > 1");
            while (resultSet.next()) {
                System.out.print(resultSet.getInt("id") + " ");
                System.out.println(resultSet.getString("name"));
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
