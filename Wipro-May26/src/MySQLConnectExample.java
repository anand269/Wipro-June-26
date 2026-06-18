
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLConnectExample {
    public static void main(String[] args) {
        // JDBC URL format: jdbc:mysql://hostname:port/dbname
        String url = "jdbc:mysql://localhost:3306/wiprodb";
        String user = "root";   // replace with your MySQL username
        String password = "1234"; // replace with your MySQL password

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database successfully!");

            // Create a statement
            Statement stmt = conn.createStatement();

            // Execute query
            ResultSet rs = stmt.executeQuery("SELECT * FROM persons");

            // Process results
            while (rs.next()) {
                int id = rs.getInt("PersonID");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                String city = rs.getString("city");
                String email = rs.getString("Email");
                String address = rs.getString("Address");
                System.out.println(id + " | " + firstName + " | " + lastName + " | " + address +" | "+city + " | " + email);
            }

            // Close connection
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

