# First REST API

## Project Description

This project is a REST API application developed using Spring Boot.

The application allows users to manage products through full CRUD operations:

- Create Product
- Read Product
- Read All Products
- Update Product
- Delete Product

The project uses Spring Data JPA with an H2 in-memory database for data persistence and Swagger UI for API testing and documentation.

---

## Technologies Used

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database
- Swagger OpenAPI
- Maven

---

## Project Structure

```text
product
 ├── api
 │    ├── request
 │    └── response
 ├── domain
 ├── repository
 ├── service
 ├── support
 └── exception

shared
 ├── api
 │    └── response
 └── exception
```

---

## API Endpoints

### Create Product

**POST** `/api/v1/products`

Request:

```json
{
  "name": "Ferrari"
}
```

---

### Get Product By Id

**GET** `/api/v1/products/{id}`

Example:

```text
/api/v1/products/1
```

---

### Get All Products

**GET** `/api/v1/products`

---

### Update Product

**PUT** `/api/v1/products/{id}`

Request:

```json
{
  "name": "Lamborghini"
}
```

---

### Delete Product

**DELETE** `/api/v1/products/{id}`

---

## Exception Handling

Custom exception handling was implemented using a global exception handler.

Example response:

```json
{
  "message": "Product with id 99 not found"
}
```

Status:

```text
404 NOT FOUND
```

---

## H2 Database

H2 was used as an in-memory database.

H2 Console:

```text
http://localhost:8080/console
```

JDBC URL:

```text
jdbc:h2:mem:testdb
```

Example SQL query:

```sql
SELECT * FROM PRODUCT;
```

---

## Swagger Documentation

Swagger UI was used to test and document all API endpoints.

URL:

```text
http://localhost:8080/swagger-ui/index.html
```

---

## How to Run the Project

1. Clone the repository
2. Open the project in IntelliJ IDEA
3. Reload Maven dependencies
4. Run the Spring Boot application
5. Open Swagger UI
6. Test API endpoints
7. Open H2 Console to verify database operations

---

## Author

Hocine Touati
