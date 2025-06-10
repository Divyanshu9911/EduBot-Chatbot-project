-- Create Database
CREATE DATABASE IF NOT EXISTS chatbot_db;
USE chatbot_db;

-- Table for storing predefined questions and answers
CREATE TABLE IF NOT EXISTS queries (
    id INT AUTO_INCREMENT PRIMARY KEY,
    question VARCHAR(255),
    answer TEXT
);

-- Insert predefined question-answer pairs
INSERT INTO queries (question, answer) VALUES
('exam', 'Your semester exams begin from 29 April 2025.'),
('fees', 'Fees can be paid via ERP or accounts office.'),
('attendance', 'Check attendance on the student portal.'),
('library', 'Library is open from 9 AM to 6 PM.'),
('hod', 'HOD of CSE is Dr. XYZ.');

-- Table for storing chat history (optional but useful)
CREATE TABLE IF NOT EXISTS chat_history (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_input TEXT,
    bot_response TEXT,
    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
