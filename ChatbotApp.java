import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatbotApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("EduBot - College Chatbot");
        JTextField inputField = new JTextField();
        JTextArea outputArea = new JTextArea();
        JButton askButton = new JButton("Ask");

        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        frame.setLayout(null);
        inputField.setBounds(30, 30, 400, 30);
        askButton.setBounds(440, 30, 80, 30);
        scrollPane.setBounds(30, 70, 490, 300);

        frame.add(inputField);
        frame.add(askButton);
        frame.add(scrollPane);

        askButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String question = inputField.getText();
                ChatbotDAO dao = new ChatbotDAO();
                String answer = dao.getAnswer(question);
                outputArea.append("You: " + question + "\n");
                outputArea.append("Bot: " + answer + "\n\n");
                inputField.setText("");
            }
        });

        frame.setSize(570, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}