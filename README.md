# ISS Assignment

## 1. Client-Side Programming

### 1.1 HTML Basics
- HTML is used to struct ure a webpage.
- Common elements include headings, paragraphs, forms, labels, inputs, buttons, and containers.
- Forms are used to collect user input from the user.
- In the assignment, a registration form was created using form-related HTML elements.

### 1.2 CSS Basics
- CSS is used to style the visual appearance of a webpage.
- It controls colors, spacing, layout, borders, fonts, and shadows.
- In the assignment, CSS was used to create a neat form container, center the form, and style error messages.
- CSS helps improve the user experience by making the interface attractive and readable.

### 1.3 JavaScript Basics
- JavaScript makes webpages interactive.
- It is used to respond to user actions such as clicks, typing, and form submission.
- In the assignment, JavaScript was used to validate a registration form before submission.

### 1.4 Form Validation Concepts
- Form validation ensures that the entered data is correct before submission.
- Validation checks include:
  - Username length should be at least 3 characters.
  - Email should follow a valid format.
  - Password should be at least 6 characters long.
  - A radio button option must be selected.
  - The terms-and-conditions checkbox must be checked.
- If validation fails, error messages are displayed.
- If validation passes, a success message appears.

### 1.5 DOM Manipulation
- The Document Object Model (DOM) allows JavaScript to access and modify HTML elements.
- The assignment used DOM methods to:
  - get input values,
  - display error messages,
  - hide error messages,
  - reset the form,
  - show a success alert.

### 1.6 Event Handling
- Events occur when the user interacts with the webpage.
- The main event used in the assignment is submit.
- The code uses event.preventDefault() to stop the browser from submitting the form normally so validation can happen first.

### 1.7 Bootstrap Integration
- Bootstrap is a CSS framework that provides ready-made design components.
- It helps create responsive and professional-looking forms quickly.
- In the assignment, Bootstrap classes were used for spacing, layout, buttons, and form styling.

---

## 2. Database Management System (DBMS)

### 2.1 Database Fundamentals
- A database is an organized collection of data.
- A DBMS is software used to store, manage, and retrieve data.
- In the assignment, a simple shop database was created using SQL.

### 2.2 SQL Categories
- DDL (Data Definition Language): used to create and define database structures.
- DML (Data Manipulation Language): used to insert, update, delete, and retrieve data.
- DCL and TCL are also important in real-world databases, though the assignment mainly focused on DDL and DML.

### 2.3 DDL Commands
- CREATE DATABASE is used to create a new database.
- USE is used to select a database for further operations.
- CREATE TABLE is used to define tables and columns.
- Constraints such as PRIMARY KEY, NOT NULL, UNIQUE, DEFAULT, CHECK, and FOREIGN KEY are used to enforce rules.

### 2.4 Table Design Concepts
- A table stores rows and columns.
- Each row is a record.
- Each column is a field or attribute.
- In the assignment, tables such as customers, products, orders, and orderItems were created.

### 2.5 Constraints Used
- PRIMARY KEY ensures unique identification of records.
- FOREIGN KEY creates relationships between tables.
- NOT NULL ensures a column cannot be empty.
- UNIQUE ensures no duplicate values in a column.
- CHECK restricts values using conditions.
- DEFAULT sets a default value if none is provided.

### 2.6 DML Commands
- INSERT adds data into tables.
- SELECT retrieves data.
- UPDATE modifies existing records.
- DELETE removes records.
- The assignment used all these operations while working with the shop database.

### 2.7 Filtering and Sorting
- WHERE is used to filter records based on conditions.
- LIKE is used for pattern matching.
- ORDER BY is used to sort data in ascending or descending order.
- LIMIT restricts the number of returned records.

### 2.8 Aggregate Functions
- COUNT returns the number of rows.
- SUM calculates the total of numeric values.
- CONCAT combines string values.
- GROUP BY groups records for aggregate calculations.

### 2.9 Joins in SQL
- JOINs are used to combine data from multiple tables.
- Types used in the assignment include:
  - INNER JOIN: returns matching records.
  - LEFT JOIN: returns all rows from the left table and matching rows from the right table.
  - RIGHT JOIN: returns all rows from the right table and matching rows from the left table.
  - FULL OUTER JOIN: returns all rows from both tables, though this is often simulated using UNION.
- JOINS are very important in relational databases because related data is usually stored across multiple tables.

### 2.10 Set Operations
- UNION combines results from two queries.
- INTERSECT returns common results between two queries.
- These were used to compare or combine data logically.

### 2.11 Views
- A view is a virtual table created from a query.
- It simplifies complex queries.
- In the assignment, a view was created to show customer order details in a combined report.

### 2.12 Stored Procedures
- A stored procedure is a saved SQL block that performs a specific task.
- It helps reuse logic in the database.
- In the assignment, a stored procedure was created to update the stock of a product.

### 2.13 Normalization
- Normalization is the process of organizing data to reduce redundancy and avoid anomalies.
- The main forms studied were:
  - 1NF: values must be atomic and repeating groups must be removed.
  - 2NF: every non-key attribute must depend on the whole key.
  - 3NF: no transitive dependency should remain.
- This concept is important because well-structured databases are easier to maintain and query.

---

## 3. Java Programming

### 3.1 OOP Concepts
- Java is an object-oriented programming language.
- Key concepts include:
  - Class: a blueprint for objects.
  - Object: an instance of a class.
  - Constructor: used to initialize object values.
  - Methods: define behavior.
- The assignment included basic examples of creating classes and objects.

### 3.2 Classes and Objects
- A class contains variables and methods.
- Objects are created from those classes.
- Example: a Car class with properties like wheels, doors, and color.

### 3.3 Collections Framework
- The Java Collections Framework provides data structures for storing groups of objects.
- Important collection types include:
  - List: ordered collection, allows duplicates.
  - ArrayList: dynamic array implementation of List.
  - Set: stores unique values.
  - HashSet: set implementation using hashing.
  - Map: stores key-value pairs.
  - HashMap: common map implementation.
- The assignment demonstrated how to add, sort, iterate, and print data from these collections.

### 3.4 Comparable and Comparator
- Comparable is used to define the natural ordering of objects.
- Comparator is used to define custom ordering logic.
- These were demonstrated using Student objects.

### 3.5 Exception Handling
- Exceptions are errors that occur during program execution.
- Java provides try, catch, and finally blocks.
- try contains risky code.
- catch handles the exception.
- finally always executes.
- throw is used to explicitly throw an exception.
- throws is used to declare that a method may throw an exception.

### 3.6 File Handling
- Java can create, read, write, and delete files.
- The File class represents files and folders.
- FileWriter and Scanner are used for writing and reading data.
- The assignment implemented basic file operations.

### 3.7 Multithreading
- Multithreading allows multiple threads to run concurrently.
- A thread is a lightweight execution path.
- Concepts covered include:
  - extending Thread class,
  - implementing Runnable,
  - starting threads,
  - sleeping threads,
  - thread pools,
  - synchronization,
  - volatile keyword.
  - Method and block synchronization.
- Multithreading is useful when tasks can be executed parallelly.

### 3.8 JDBC
- JDBC stands for Java Database Connectivity.
- It allows Java applications to connect to databases such as MySQL.
- The assignment demonstrated:
  - connecting to a database,
  - executing SQL queries,
  - reading data using ResultSet.
- JDBC is used in real-world Java applications to interact with databases.

### 3.9 XML Handling
- XML is a markup language used for structured data storage.
- Java can parse XML files using DOM parsers.
- The assignment showed how to read data from an XML file and print values like title, genre, and developer.

### 3.10 JSON Handling
- JSON is a lightweight data format used widely in web applications.
- Java can create JSON objects and arrays using libraries.
- The assignment demonstrated nested JSON structures with properties like character profile and inventory items.

---

## 4. Python Programming

### 4.1 Variables and Constants
- Variables store values that can change.
- Constants store values that are expected to remain fixed.
- Python uses simple assignment syntax like =.

### 4.2 Data Types
- Python supports several builtin data types, including:
  - int for integers,
  - bool for booleans,
  - str for strings,
  - list for ordered mutable collections,
  - tuple for immutable ordered collections,
  - set for unique values,
  - dict for key-value pairs.

### 4.3 Type Conversion
- Type conversion changes one data type into another.
- Examples include converting string to int and string to float.
- This is useful when taking user input because input values are often strings.

### 4.4 Control Flow
- Control flow decides the order in which code is executed.
- Concepts include:
  - if-else statements,
  - for loops,
  - while loops,
  - break and continue,
  - pass,
  - loop-else structure.

### 4.5 Functions
- Functions are reusable blocks of code.
- They help organize programs into smaller logical units.
- Parameters and arguments allow functions to accept input.
- return sends output back to the caller.
- *args and **kwargs allow functions to accept multiple arguments and keyword arguments.

### 4.6 Error Handling
- Python uses try, except, else, and finally blocks for error handling.
- This prevents programs from crashing unexpectedly.
- Specific exceptions such as ZeroDivisionError can be handled separately.

---

## 5. Server-Side Programming

### 5.1 Servlet Basics
- A servlet is a Java class that handles web requests.
- It runs on a server and responds to client requests.
- Servlets are used to process login, registration, and other web actions.

### 5.2 HTTP Methods
- GET requests data from the server.
- POST submits data to the server.
- In the assignment, doGet and doPost methods were used.

### 5.3 Request and Response Handling
- HttpServletRequest is used to read incoming data from the client.
- HttpServletResponse is used to send output or redirect the user.
- Parameters can be read from forms submitted by users.

### 5.4 Session Management
- Sessions are used to remember information about a user across multiple requests.
- The assignment used HttpSession to store the logged-in username.
- This helps keep a user logged in while navigating the application.

### 5.5 Redirect and Forward
- redirect sends the user to another page.
- forward passes control to another resource while keeping the same request.
- These concepts were used in the login and registration flow.

### 5.6 JSP Pages
- JSP stands for JavaServer Pages.
- It is used to create dynamic web pages with HTML and Java logic.
- In the assignment, JSP pages such as login.jsp, register.jsp, and welcome.jsp were used.

### 5.7 Mock Database in Java
- A simple in-memory database was created using HashMap.
- It stored usernames and passwords temporarily.
- This helped demonstrate login and registration flow without using a real database.

---
