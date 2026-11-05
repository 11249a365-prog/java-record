CREATE DATABASE IF NOT EXISTS java_lab;
USE java_lab;

CREATE TABLE IF NOT EXISTS students (
    roll_no INT PRIMARY KEY,
    name VARCHAR(30) NOT NULL,
    marks INT NOT NULL
);

INSERT INTO students (roll_no, name, marks) VALUES
    (101, 'Ravi', 78),
    (102, 'Meena', 92),
    (103, 'Sara', 66)
ON DUPLICATE KEY UPDATE name = VALUES(name), marks = VALUES(marks);
