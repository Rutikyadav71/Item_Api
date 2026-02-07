# Item Management REST API

Simple Spring Boot REST API to manage items (ecommerce-style) using in-memory ArrayList storage. Supports CRUD operations with validation and global error handling.

---

## Features:
- Add a new item (ID auto-generated)
- Get item by ID
- Get all items
- Delete item by ID
- Update Item by ID 
- Input validation (Spring Boot Validation)
- Global exception handling

---

## Technologies:
- Java
- Spring Boot
- Spring Web (REST API)
- Spring Boot Validation
- In-memory storage (ArrayList)

---

### Item Model:

Fields:

- **id**: Auto-generated (client must not provide)
- **name**: Required (min 3 characters)
- **description**: Required
- **price**: Must be positive

---

## API Endpoints:

### Add Item :
- **Method**: POST
- **Path**: `/api/items/add`
- **Purpose**: Add a new item

Request Body Example:

```json
{
  "name": "Mobile",
  "description": "Gaming Mobile",
  "price": 45000
}
```
### Get Items :
- **method**: GET
-  **path**: `/api/items`
- **purpose**: Get all items

### Get Item by ID :
- **method**: GET
- path: `/api/items/{id}`
- purpose: Get single item by ID

### Update Item by ID : 
- **Method**: PUT
- **Path**: `/api/items/{id}`
- **Purpose**: Update an existing item

Request Body Example:

```json
{
  "name": "Updated Mobile",
  "description": "New Description",
  "price": 50000
}
```
### Delete Item by ID :
- **method**: DELETE
-  **path**: `/api/items/{id}`
- **purpose**: Delete item by ID

---
## validation_rules:
- name: Required, minimum 3 characters
- description: Required
- price: Must be greater than 0
- id: Must not be sent in POST request

---
## error_handling:
- invalid_request: Returns 400 if client provides ID in POST request
- not_found: Returns 404 if item ID does not exist
- validation_errors: Returns 400 with field-level messages

---
## run_locally:
steps:
- Clone repository
- Run command: mvn spring-boot:run
- Server starts at: http://localhost:8080

---
## deployment:
deployed on platforms:
- Render : 

---
## author:
- name: Rutik Yadav
- role: Java Developer | Spring Boot | Full Stack Developer
