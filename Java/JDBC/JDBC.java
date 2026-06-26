package Java.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/javajdbc";
        String username = "root";
        String password = "AviRaj@1";

        try {
            System.out.println("Attempting to connect");
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successful!\n");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

            System.out.println("Database Results");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }

            connection.close();

        } catch (Exception e) {
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }
    }
}