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
* Role-Based Authentication

---

## 🔐 Authentication

This project uses Spring Security with Basic Authentication.

To access secured APIs, include Authorization header:

Authorization: Basic <base64(username:password)>

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

* PUT /user
* DELETE /user

### Journal APIs

* GET /journal
* POST /journal
* GET/journal/id{myId}
* DELETE/journal/id{myId}
* PUT/journal/id{myId}

## Admin APIs
* GET/admin/all-users
* POST/admin/create-admin-user


---

## 💡 Future Improvements

* JWT Authentication
* Exception Handling
* Logging
* Deployment (AWS / Render)

---

## 👩‍💻 Author

Himanshi
