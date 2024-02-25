import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USERNAME = "yasha";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        Connection connection = null;
        try {
          
            Class.forName("com.mysql.cj.jdbc.Driver");
            
       
            System.out.println("Connecting to database...");
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            
            if (connection != null) {
                System.out.println("Connected to the database!");
              
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Could not find the database driver: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Connection failed! Error: " + e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
    }
}
