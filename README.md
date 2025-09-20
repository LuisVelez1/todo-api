# 📝 ToDo API

[![Java](https://img.shields.io/badge/Java-21-blue?logo=java&logoColor=white)](https://adoptium.net/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-brightgreen?logo=springboot)](https://spring.io/projects/spring-boot)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15-blue?logo=postgresql)](https://www.postgresql.org/)
[![Maven](https://img.shields.io/badge/Maven-Build-orange?logo=apachemaven)](https://maven.apache.org/)
[![OpenAPI](https://img.shields.io/badge/OpenAPI-3.0-6BA539?logo=swagger)](https://swagger.io/resources/open-api/)
[![License](https://img.shields.io/badge/License-Apache%202.0-yellow)](LICENSE)

A REST API built with **Spring Boot 3**, **Java 21**, and **PostgreSQL** for task management.  
Includes full **CRUD operations**, validation, **OpenAPI/Swagger documentation**, and best practices. ⚡

---

## 🚀 Tech Stack
- [Java 21](https://adoptium.net/)
- [Spring Boot 3](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [PostgreSQL](https://www.postgresql.org/)
- [Lombok](https://projectlombok.org/)
- [Springdoc OpenAPI](https://springdoc.org/)

---

## ⚙️ Prerequisites
- **Java 21** → `java -version`
- **Maven** → `mvn -version`
- **PostgreSQL** running locally

---

## 📂 Project Structure
```bash
ToDo-API/
│── src/
│   ├── main/
│   │   ├── java/com/todoapi/
│   │   │   ├── configuration/   # Configurations (OpenAPI, etc.)
│   │   │   ├── persistence/     # Entities & repositories
│   │   │   ├── presentation/    # Controllers & DTOs
│   │   │   ├── service/         # Business logic
│   │   │   └── ToDoApiApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── schema.sql / data.sql (optional)
│── pom.xml
└── README.md
