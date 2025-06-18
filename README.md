# 23IOTA10 Day 2 Task

Created a Maven project titled **Day2_23IOTA10**. Done the following tasks in that project.

## Dependencies Added to the pom.xml file:
- i) Apache Log4j SLF4J Binding
- ii) Apache Commons CLI
- iii) MongoDB Sync Driver

## Library Management System
The program has a base class named **Book** and subclasses for specific types of books, such as **FictionBook** and **NonFictionBook**.
- **BookDocument** is used to convert book title, etc. to a MongoDB file.
- **MongoConnection** is used to establish a connection to the MongoDB database.
- **LibraryApp** is the main class used to add books, titles, etc.

The files are located in: 23iota10_Day2/src/main/java/book

## Banking System
Designed a Java program that simulates a basic banking system.
- Users can **create accounts**, **deposit money**, **withdraw money**, and **check balances**.
- **Exception handling** is implemented to manage invalid operations, such as overdrafts, negative transactions, and non-existent accounts.

The files are located in: 23iota10_Day2/src/main/java/bank

