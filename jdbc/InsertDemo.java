package src.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo {
    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost:3306/STUDENTS";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "root");
            Statement statement = con.createStatement();
            String query = "INSERT into employee values (4, 'sudip' , 'address')";
            int result = statement.executeUpdate(query);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

    }
}
