package src.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateDemo {
    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost:3306/STUDENTS";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "root");
            Statement statement = con.createStatement();
            String query = "Delete from  employee where id > 1";
            int result = statement.executeUpdate(query);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

    }
}
