# 🔐 Spring Boot Login System

A full-stack web application built using **Spring Boot**, **Thymeleaf**, and **MySQL** that allows users to register and log in. This project demonstrates a basic backend architecture with MVC pattern and database integration.

---

## 🚀 Features

* User Registration
* User Login Authentication
* Form Validation (Frontend)
* Database Integration using JPA
* MVC Architecture (Controller, Service, Repository)
* Dynamic HTML rendering using Thymeleaf

---

## 🛠️ Tech Stack

**Backend**

* Java 17
* Spring Boot
* Spring MVC
* Spring Data JPA

**Frontend**

* HTML, CSS
* Thymeleaf

**Database**

* MySQL

**Build Tool**

* Maven

---

## 📁 Project Structure

```
login/
 ├── controller/        # Handles HTTP requests
 ├── entity/            # JPA Entity classes
 ├── repository/        # Database interaction layer
 ├── service/           # Business logic layer
 ├── templates/         # HTML pages (Thymeleaf)
 ├── application.properties
 └── LoginApplication.java
```

---

## ⚙️ Setup Instructions

### 1. Clone the repository

```
git clone https://github.com/jeevansankar/springboot-login-system.git
cd springboot-login-system
```

### 2. Configure MySQL

Create a database:

```
CREATE DATABASE loginDb;
```

Update `application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/loginDb
spring.datasource.username=your_username
spring.datasource.password=your_password
```

---

### 3. Run the application

```
mvn spring-boot:run
```

OR run `LoginApplication.java` from your IDE.

---

### 4. Access the application

* Register: http://localhost:8082/register
* Login: http://localhost:8082/login

---

## 📌 How It Works

1. User registers → data saved in MySQL
2. User logs in → credentials validated
3. If valid → redirected to home page
4. If invalid → error message shown

---

## ⚠️ Current Limitations

* Passwords stored in plain text (not secure)
* No backend validation
* Service layer not fully utilized
* No authentication framework (like Spring Security)
* No session or token management

---

## 🔥 Future Improvements

* Add **Spring Security**
* Implement **password hashing (BCrypt)**
* Use **JWT authentication**
* Add **backend validation (@Valid)**
* Improve exception handling
* Role-based authorization (Admin/User)

---

## 👨‍💻 Author

**Jeevan Sankar Challagundla**

* GitHub: https://github.com/jeevansankar

---

## ⭐ Summary

This project is a beginner-friendly implementation of a login system using Spring Boot. It demonstrates core backend concepts but requires enhancements to meet production-level standards.
