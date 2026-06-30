# Backend - Mentor Task Flow

This backend project is built with **Spring Boot** and follows a layered architecture to separate responsibilities and improve maintainability.

## Project Structure

```
src/main/java/com/mentortaskflow/backend
│
├── config
├── controller
├── dto
├── entity
├── repository
├── service
├── util
└── BackendApplication.java
```

## Package Description

### config
Contains application configuration classes such as security, CORS, and other Spring configurations.

### controller
Handles HTTP requests and responses. Controllers receive requests from the client and delegate business logic to the service layer.

### dto
Contains Data Transfer Objects (DTOs) used for transferring data between the client and the server.

### entity
Represents database tables using JPA entities.

### repository
Provides database access using Spring Data JPA repositories.

### service
Contains the business logic of the application. Services process data and communicate with repositories.

### util
Contains utility/helper classes used throughout the project.

## Architecture Flow

```
Client
   │
   ▼
Controller
   │
   ▼
Service
   │
   ▼
Repository
   │
   ▼
Database
```

## Technologies

- Java 17
- Spring Boot
- Maven
- Spring Data JPA