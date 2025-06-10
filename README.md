# EduBot – College Enquiry Chatbot

EduBot is a simple Java-based GUI chatbot designed to help students of Galgotias University get instant answers to common queries like fees, exam schedules, HOD info, contact details, academic calendar, etc. It uses Java Swing for the interface and MySQL with JDBC for database interaction.

---

## 🔧 Features

- User-friendly **Graphical Interface (Java Swing)**
- Handles queries like:
  - "What is the fee?"
  - "Who is the HOD?"
  - "When is the exam?"
  - "How to contact the college?"
- Input validation (empty input check, case-insensitive)
- Exit command (`exit`) and Help command (`help`)
- Chat history saved in **MySQL** using **JDBC + PreparedStatement**
- Error handling for invalid input and DB connection
- Modular code with clear class structure

---

## 🛠️ Technologies Used

- Java (JDK 17+)
- Java Swing
- MySQL
- JDBC (Java Database Connectivity)

---

## 🗂️ Project Structure
EduBot/
├── src/
│   ├── ChatbotGUI.java          # Main GUI class for user interaction
│   ├── ChatbotModel.java        # Logic for processing user input
│   ├── ChatbotDAO.java          # Handles database operations (Insert/Fetch)
│   ├── DBConnection.java        # Establishes connection with MySQL
├── chatbot_db.sql               # SQL file to create database and chat_history table
├── README.md                    # Project documentation
├── ppt/
│   └── EduBot_Presentation.pptx  # Final submission presentation file
├── lib/
│   └── mysql-connector-java.jar # JDBC driver (if included)

---

## ▶️ How to Run

1. Install **JDK 17+** and any Java IDE (e.g., IntelliJ or Eclipse).
2. Download **MySQL JDBC Driver** from:
   [https://dev.mysql.com/downloads/connector/j/](https://dev.mysql.com/downloads/connector/j/)
3. Add `mysql-connector-java-x.x.xx.jar` to your project classpath.
4. Import the project and run `chatbot_db.sql` in MySQL to create database and table.
5. Open and run `ChatbotGUI.java`.

---

## 🧩 Database Info

- **Database Name:** `edubot`
- **Table Name:** `chat_history`
- **Fields:**
  - `id` (INT, AUTO_INCREMENT)
  - `user_input` (TEXT)
  - `bot_response` (TEXT)
  - `timestamp` (DATETIME)

---

## ✅ Input Validation & Error Handling

- Handles **blank input** (shows "Please enter something.")
- Case-insensitive matching (`"hello"` = `"Hello"`)
- SQL injection safe using **PreparedStatement**
- Shows message if DB connection fails
- Supports `exit` to quit and `help` to guide user

---

## 💡 Future Scope

- Add voice-based interaction
- Host chatbot on website (web-based version)
- Add support for Hindi/English queries
- Export chat history to PDF or text file

---

## 🧪 Example Queries

> "What is the fee?"  
> "Exam date?"  
> "Who is the HOD?"  
> "Time table?"  
> "Contact info"

---

## 👨‍💻 Developers

- **Divyanshu Singh**  
- **Ashish Ranjan Singh**  
**Galgotias University**  
Semester: 2nd (2028 Passout Batch)

---

## 📜 License

This project is built for educational purposes only and is part of the GUVI-Galgotias University 2nd Semester Review Project.
