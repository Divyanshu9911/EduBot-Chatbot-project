import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ChatbotDAO {
    public String getAnswer(String question) {
        String answer = "Sorry, I don't know the answer to that.";
        try {
            Connection conn = DBConnection.getConnection();
            String sql = "SELECT answer FROM queries WHERE ? LIKE CONCAT('%', question, '%')";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, question.toLowerCase());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                answer = rs.getString("answer");
            }

            // ✅ Save chat history to DB (Optional but recommended)
            String insertSQL = "INSERT INTO chat_history (user_input, bot_response) VALUES (?, ?)";
            PreparedStatement logStmt = conn.prepareStatement(insertSQL);
            logStmt.setString(1, question);
            logStmt.setString(2, answer);
            logStmt.executeUpdate();

            conn.close();
        } catch (Exception e) {
            System.out.println("Database error: " + e.getMessage());
            e.printStackTrace();
        }
        return answer;
    }
}
