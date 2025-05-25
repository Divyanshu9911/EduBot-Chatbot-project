# EduBot - College Enquiry Chatbot

A simple Java-based GUI chatbot for Galgotias University information.


# EduBot - College Enquiry Chatbot

*EduBot* is a simple Java-based GUI chatbot built to provide students with quick information related to *Galgotias University* such as fees, exam dates, HOD details, academic calendar, contact info, and more.

---

## Features:
- GUI built using *Java Swing*
- Responds to natural queries like:
  - "What is the fee?"
  - "Who is the HOD?"
  - "When is the exam?"
- Stores chat history into *MySQL database* using *JDBC*
- Clean and interactive layout

---

## Technologies Used:
- Java (JDK 17+)
- Java Swing (GUI)
- JDBC (MySQL Connectivity)
- MySQL Database

---

## Project Structure:

---

## How to Run:

1. *Install JDK 17+* and any Java IDE (IntelliJ, Eclipse, etc.)
2. *Import JDBC Connector*:
   - Download mysql-connector-java-x.x.xx.jar from [MySQL Site](https://dev.mysql.com/downloads/connector/j/)
   - Add it to your project classpath.
3. *Setup Database*:
   - Open MySQL and run database.sql file to create edubot DB and chat_history table.
4. **Run ChatbotGUI.java** from your IDE.

---

## MySQL Database Details:
- *DB Name:* edubot
- *Table:* chat_history
- *Fields:* id, user_input, bot_response, timestamp

---

## Example Queries:
> "What is the fee?"  
> "Who is the HOD?"  
> "Exam date?"  
> "Contact details?"  
> "Time table?"

---

## Developer:
- *Name:* Divyanshu  Singh, Ashish ranjan singh
- *University:* Galgotias University  
- *Semester:* 2nd (2028 Passout Batch)

---

## License:
This project is for educational purposes only.
