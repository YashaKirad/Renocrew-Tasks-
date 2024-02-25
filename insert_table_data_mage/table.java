import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableExample {

    
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USERNAME = "yasha";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        try {
          
            Class.forName("com.mysql.cj.jdbc.Driver");

         
            System.out.println("Connecting to database...");
            try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {

                
                String sql = "CREATE TABLE IF NOT EXISTS mytable (" +
                        "tId INT AUTO_INCREMENT PRIMARY KEY," +
                        "tName VARCHAR(50) NOT NULL," +
                        "tCity VARCHAR(50) NOT NULL)";
                
                try (Statement statement = connection.createStatement()) {
               
                    statement.executeUpdate(sql);
                    System.out.println("Table created successfully.");
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Could not find the database driver: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Connection failed! Error: " + e.getMessage());
        }
    }
}
