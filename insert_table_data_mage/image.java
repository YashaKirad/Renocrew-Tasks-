import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertImageExample {

    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USERNAME = "yasha";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        try {
        
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Connecting to database...");
            try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {

          
                String sql = "INSERT INTO images (image_name, image_data) VALUES (?, ?)";
                try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

                
                    String imagePath = C:\Users\yasha\Pictures\Screenshots\image.jpg";


                    preparedStatement.setString(1, "image.jpg");

               
                    File imageFile = new File(imagePath);
                    try (FileInputStream fis = new FileInputStream(imageFile)) {
                        preparedStatement.setBinaryStream(2, fis, (int) imageFile.length());

                        
                        int rowsAffected = preparedStatement.executeUpdate();

                        if (rowsAffected > 0) {
                            System.out.println("Image inserted successfully.");
                        } else {
                            System.out.println("Failed to insert image.");
                        }
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Could not find the database driver: " + e.getMessage());
        } catch (SQLException | IOException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
