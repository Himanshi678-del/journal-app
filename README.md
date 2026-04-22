# 📝 Journal Application (Spring Boot)

## 🚀 Overview

This is a backend-based Journal Application built using Spring Boot.
It allows users to create, manage, and secure their personal journal entries.

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* Spring Security
* MongoDB
* Maven

---

## 🔐 Features

* User authentication & authorization
* Secure APIs using Spring Security
* Create, update, delete journal entries
* User-specific journal management
* RESTful API design

---

## 📂 Project Structure

* Controller → Handles API requests
* Service → Business logic
* Repository → Database interaction
* Entity → Data models
* Config → Security configuration

---

## ⚙️ Configuration

Create your own `application.properties` file and add:

spring.data.mongodb.uri=YOUR_MONGO_URI
spring.data.mongodb.database=journaldb

---

## ▶️ How to Run

```bash
git clone https://github.com/YOUR_USERNAME/journal-app.git
cd journal-app
./mvnw spring-boot:run
```

---

## 📌 API Endpoints (Sample)

### Public APIs

* POST /public/create-user

### User APIs

* GET /user
* POST /user

### Journal APIs

* GET /journal
* POST /journal

---

## 💡 Future Improvements

* JWT Authentication
* Exception Handling
* Logging
* Deployment (AWS / Render)

---

## 👩‍💻 Author

Himanshi
