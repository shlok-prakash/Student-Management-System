# Student Management System

*A Telit Interview Assignment*

![Java](https://img.shields.io/badge/Java-007396?logo=java&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-Concepts-blue)
![Status](https://img.shields.io/badge/Project-Completed-brightgreen)

------------------------------------------------------------------------

## 📌 Author

**Shlok Prakash** - [LinkedIn](https://www.linkedin.com/in/shlok-prakash/)

------------------------------------------------------------------------

## 🚀 Tech Stack

-   **Java** (Core Java, OOP)
-   **Collections Framework**
-   **Exception Handling**

------------------------------------------------------------------------

## 📘 Project Overview

This is a simple **console-based Java application** designed as part of
the Telit Interview Assignment.\
The project demonstrates: - Creation of a Student class - Enrolling
courses - Managing students using a List - Searching students by ID -
Handling custom exceptions - Sorting (Bonus)

------------------------------------------------------------------------

## 🧩 Features

### ✅ Student Class

-   Attributes: name, age, studentId, courses
-   Methods: enrollCourse(), printStudentInfo()

### ✅ Core Functionalities

-   Create and manage multiple student objects
-   Store students in a list
-   Search student by ID with exception handling

[//]: # (### Bonus Features)

[//]: # ()
[//]: # (-   Sort students by name)

[//]: # (-   Dynamic user input support)

------------------------------------------------------------------------

## 📂 Project Structure

    StudentManagementSystem/
    │
    ├── src/
    │   ├── Main.java
    │   ├── Student.java
    │   └── StudentNotFoundException.java
    │
    └── README.md

------------------------------------------------------------------------

## ▶️ How to Run

### Prerequisites

-   Java JDK 8 or higher

### Steps

1.  Download or clone the project
2.  Open in any Java IDE
3.  Run Main.java

Terminal:

    javac Main.java
    java Main

------------------------------------------------------------------------

## 📌 Sample Output

```
            ************ STUDENT MANAGEMENT SYSTEM ************
            ************ Welcome ************
            Select an Option....
            1. Register a Student
            2. Find a student with StudentId
            3. List all the Student Information
            4. List all the Student Information in Sorted Order
            5. Exit
            Enter your Option :
            1
            Enter the Name of the Student : Shlok Prakash
            Enter the age of the Student : 24
            Enter the Id of the Student : S-1
            Enter the course to be enrolled !!! Type Done to exit
            Java
            Student is enrolled to Java successfully!!
            Enter the course to be enrolled !!! Type Done to exit
            Dsa
            Student is enrolled to Dsa successfully!!
            Enter the course to be enrolled !!! Type Done to exit
            done
            
            ========= Student Data =========
            Student Name: Shlok
            Student Id: S-1
            Student age: 24
            Enrolled For: [Java, Dsa]
            ================================
            
            ************ Welcome ************
            Select an Option....
            1. Register a Student
            2. Find a student with StudentId
            3. List all the Student Information
            4. List all the Student Information in Sorted Order
            5. Exit
            Enter your Option :
            5
            
            Thanks for Enrolling ... have a GoodDay!!!
```


------------------------------------------------------------------------

## 🔮 Future Enhancements

-   Implement database storage 

