1. Project Overview
  Project Name: Library Management System
  Language: Java (Swing GUI)
  Database: MySQL via XAMPP
  IDE: Apache NetBeans IDE
2. Installation and Setup Instructions
  Database Preparation:
    Open XAMPP Control Panel and start the Apache and MySQL services.
    Access http://localhost/phpmyadmin/ in your browser.
    Create a new database named library.
    Navigate to the Import tab and select the library.sql file provided with this project to generate the required tables.
  Running the Application:
    Open the project folder using Apache NetBeans.
    Ensure the DBConnect.java file contains the correct database credentials (Default: User = root, Password =  ).
    Right-click on the login.java or Main.java file and select Run File.
3. Key Features
  Data Management: Full CRUD operations for Books and Members.
  Borrowing System: Allows selection of members, staff, and multiple books via a transaction-based system, automatically updating book availability status.
  Return System: Search for borrowing records by ID, automatically calculate fines for overdue returns, and update the book status back to 'Available'.
  Reporting System: Filter borrowing and return history by date range or specific keywords, with functionality to Export to Excel and print reports directly.
4. Access Credentials
  Username: admin (or as defined in the staff table)
  Password: 1234 (or as defined in the staff table)
