CREATE DATABASE budgetbuddy;

USE budgetbuddy;
CREATE TABLE user 
(username VARCHAR(30) NOT NULL primary key,
name VARCHAR(100),
dob DATE,
gender VARCHAR(20),
passw VARCHAR(16) NOT NULL,
email VARCHAR(30));

USE budgetbuddy;
CREATE TABLE income
(incomeid INT(12) auto_increment NOT NULL primary key,
username VARCHAR(30),
category VARCHAR(30),
description TEXT,
amount DECIMAL(12,2),
foreign key(username) references user(username));

ALTER TABLE income AUTO_INCREMENT=1001;

USE budgetbuddy;
CREATE TABLE expenses
(expenseid INT(12) auto_increment NOT NULL primary key,
username VARCHAR(30),
category VARCHAR(30),
description TEXT,
amount DECIMAL(12,2),
foreign key(username) references user(username));

ALTER TABLE expenses AUTO_INCREMENT=1001;

USE budgetbuddy;
CREATE TABLE budget
(budgetid INT(12) auto_increment NOT NULL,
username VARCHAR(30) not null,
month VARCHAR(30),
note text,
amount DECIMAL(12,2),
primary key(budgetid, username),
foreign key(username) references user(username));

ALTER TABLE budget AUTO_INCREMENT=1001;

