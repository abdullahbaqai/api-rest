# 🏢 Department REST API with Swagger UI

A lightweight, easy-to-use REST API built using **Spring Boot** for managing department records. This project demonstrates CRUD operations and includes interactive API documentation via **Swagger UI** using Springdoc OpenAPI.

---

## 🚀 Features

- ✅ Create, Read, Update, Delete (CRUD) departments  
- ✅ RESTful API design using Spring Boot annotations  
- ✅ Swagger UI for live documentation and testing  
- ✅ Clean architecture: Controller → Service → Repository  
- ✅ In-memory H2 database (easily replaceable with MySQL/PostgreSQL)

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- Springdoc OpenAPI (Swagger 3)
- Maven
- H2 Database (or any relational DB)

---

## 📦 API Endpoints

| Method | Endpoint             | Description                |
|--------|----------------------|----------------------------|
| GET    | `/departments`       | Get all departments        |
| GET    | `/departments/{id}`  | Get a department by ID     |
| POST   | `/departments`       | Create a new department    |
| PUT    | `/departments/{id}`  | Update an existing one     |
| DELETE | `/departments/{id}`  | Delete a department        |

---

## 📄 Swagger UI

Once the application is running, access the Swagger UI here:  
➡️ [http://localhost:8081/swagger-ui.html](http://localhost:8081/swagger-ui.html)  
or  
➡️ [http://localhost:8081/swagger-ui/index.html](http://localhost:8081/swagger-ui/index.html)

---

## 🧪 Running the Project Locally

### 1. Clone the repository.

```bash
git clone https://github.com/yourusername/department-api.git
cd department-api
