package fr.adriencaubel.jdbcexample;

public class App {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3312/jdbc-training";
        String user = "root";
        String password = "password";

        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
