package fr.adriencaubel.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3312/jdbc-training";
        String user = "root";
        String password = "password";

        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn =
                    DriverManager
                            .getConnection(url, user, password);

            Statement stmt = conn.createStatement();
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS client (id INT AUTO_INCREMENT PRIMARY KEY,nom VARCHAR(100) DEFAULT 'Marcel', age INT DEFAULT 0)");

            stmt.executeUpdate("INSERT INTO client (nom, age) VALUES ('Bob', 25)");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
