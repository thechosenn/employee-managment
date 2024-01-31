# Employee Management System

## Description

This project is an Employee Management System designed to simplify the process of managing employee records and related operations in an organization. It's built using Java for the backend, React for the frontend, and MySQL as the database. Authentication is handled using JSON Web Tokens (JWT).

## Features

- **Employee Record Management:** Add, edit, view, and delete employee records.
- **Authentication System:** Secure login/logout functionality using JWT.
- **Role-Based Access Control:** Different access levels for admin and regular users.
- **Data Persistence:** Using MySQL to store and manage employee data.
- **Responsive UI:** Built with React, the interface is user-friendly and responsive.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

What things you need to install the software:

- [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Node.js and npm](https://nodejs.org/en/)
- [MySQL](https://www.mysql.com/)

### Installing

A step by step series of examples that tell you how to get a development environment running.

1. **Clone the Repository**

   ```bash
   git clone https://github.com/your-username/employee-management-system.git
   cd employee-management-system
    ```

2. **Set up the Backend**

Navigate to the backend directory and install dependencies.

   ```bash
    cd backend
    # Install dependencies
    mvn clean install
    # Run the application
    mvn spring-boot:run
   ```
   
4. **Set up the Database**

Create a MySQL database and update the application.properties file in the backend with your database credentials.

   ```bash
    spring.datasource.url=jdbc:mysql://localhost:3306/your_database
    spring.datasource.username=your_username
    spring.datasource.password=your_password
   ```
5. **Set up the Frontend**

Navigate to the frontend directory and install dependencies.

   ```bash
    cd backend
    # Install dependencies
    mvn clean install
    # Run the application
    mvn spring-boot:run
   ```

## Authors
EL Mokhtar EL AASSAL - The chosen
