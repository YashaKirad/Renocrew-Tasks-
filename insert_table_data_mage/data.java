import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDataExample {

  
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USERNAME = "yasha";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");

     
            System.out.println("Connecting to database...");
            try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {

                String sql = "INSERT INTO mytable (tName, tCity) VALUES (?, ?)";
                
          
                try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
             
                    preparedStatement.setString(1, "Yasha");
                    preparedStatement.setString(2, "Pune");
                    
          
                    int rowsAffected = preparedStatement.executeUpdate();
     
                    if (rowsAffected > 0) {
                        System.out.println("Data inserted successfully.");
                    } else {
                        System.out.println("Failed to insert data.");
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Could not find the database driver: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Connection failed! Error: " + e.getMessage());
        }
    }
}
