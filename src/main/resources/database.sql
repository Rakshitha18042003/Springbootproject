DROP DATABASE IF EXISTS EMPLOYEEDB;
CREATE DATABASE EMPLOYEEDB;

USE EMPLOYEEDB;

CREATE TABLE employee (    
empID VARCHAR(100) PRIMARY KEY,    
emp_name VARCHAR(100) NOT NULL,   
emp_age INT,
emp_dept VARCHAR(100)
);

INSERT INTO employee(empID,emp_name,emp_age,emp_dept) VALUES
('E101', 'John Doe', 30, 'IT'), 
('E102', 'Alice Smith', 25, 'HR'), 
('E103', 'Robert Johnson', 40, 'Finance'), 
('E104', 'Emma Brown', 28, 'Marketing'), 
('E105', 'Michael Wilson', 35, 'Sales');