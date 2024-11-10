package src.jdbc.preparedstatement;

import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost:3306/STUDENTS";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "root");
            String query = "select * from employee where id > ?";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1, 1);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.print(resultSet.getInt("id") + " ");
                System.out.println(resultSet.getString("name"));
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
