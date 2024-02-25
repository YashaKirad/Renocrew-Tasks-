import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.*;

public class DisplayImageFromDatabase extends JFrame {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USERNAME = "yasha";
    private static final String PASSWORD = "root";

    public DisplayImageFromDatabase() {
        setTitle("Display Image From Database");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT image_data FROM images WHERE image_id = ?");
            preparedStatement.setInt(1, 1);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                byte[] imageData = resultSet.getBytes("image_data");
                Image image = ImageIO.read(new ByteArrayInputStream(imageData));
                JLabel label = new JLabel(new ImageIcon(image));
                getContentPane().add(label, BorderLayout.CENTER);
            } else {
                JOptionPane.showMessageDialog(this, "No image found for the specified ID.");
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException | IOException e) {
            e.printStackTrace();
        }

        setSize(400, 300);
        setLocationRelativeTo(null); 
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DisplayImageFromDatabase::new);
    }
}
