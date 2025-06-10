import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/chatbot_db", "root", "root"
            );
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found. Please check your library setup.");
        } catch (Exception e) {
            System.out.println("Failed to connect to database. Please check DB URL, username, or password.");
        }
        return null;
    }
}
