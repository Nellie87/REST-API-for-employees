# REST-API-for-employees
REST API for managing employees using Springboot and MySQL

## Technologies
- Spring Boot 3.x
- Spring Data JPA
- MySQL
- Apache Maven

## Features
- CRUD operations for employee management
- Validation
- Exception handling

## API Endpoints
HTTP MethodEndpointDescriptionPOST/employeesCreate a new employeeGET/employeesRetrieve all employeesGET/employees/{id}Retrieve an employee by IDPUT/employees/{id}Update an existing employeeDELETE/employees/{id}Delete an employee

## Prerequisites
Java 17 
Maven
MySQL
Visual Studio Code extensions such as Java Debugger, Springboot Extension Pack and Java Extension Pack

## Setup & Installation
- Clone the repository:
git clone https://github.com/Nellie87/REST-API-for-employees.git

- cd REST-API-for-employees


## Configure database:
- Open src/main/resources/application.properties
- Update database connection details (URL, username, password) as per your settings


## Build the project:
- mvn clean install

## Run the application:
- mvn spring-boot:run
- it will run on port 8080
- since it's an API, there's no front end


## Testing with Postman

Import the provided Postman collection from postman/Employee_API.postman_collection.json
The collection includes requests for all API endpoints
Run the requests to test the API functionality

## Sample Request/Response
Create Employee
Request:
POST /employees
Content-Type: application/json

{
    "name": "John Doe",
    "email": "john.doe@example.com",
    "position": "Software Engineer",
    "salary": 75000.00
}
Response:
Status: 201 Created
{
    "id": 1,
    "name": "John Doe",
    "email": "john.doe@example.com",
    "position": "Software Engineer",
    "salary": 75000.00
}

## Error Handling
The API includes global exception handling for:
- Resource not found (404)
- Validation errors (400)
- Server errors (500)


