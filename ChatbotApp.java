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
                String question = inputField.getText().trim();

                if (question.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please enter something!", "Input Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (question.equalsIgnoreCase("exit")) {
                    JOptionPane.showMessageDialog(frame, "Thank you for using EduBot!", "Exit", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }

                if (question.equalsIgnoreCase("help")) {
                    String helpMsg = "You can ask:\n- What is the fee?\n- Who is the HOD?\n- Exam date?\n- Contact info\n- Time table?";
                    JOptionPane.showMessageDialog(frame, helpMsg, "Help", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                try {
                    ChatbotDAO dao = new ChatbotDAO();
                    String answer = dao.getAnswer(question);
                    outputArea.append("You: " + question + "\n");
                    outputArea.append("Bot: " + answer + "\n\n");
                } catch (Exception ex) {
                    outputArea.append("Bot: Sorry, something went wrong. Please try again later.\n\n");
                    ex.printStackTrace();
                }

                inputField.setText("");
            }
        });

        frame.setSize(570, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
