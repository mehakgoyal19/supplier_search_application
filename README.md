# supplier_search_application
This is a Spring Boot application that provides an API to search for suppliers based on location, nature of business, and manufacturing processes.

## Requirements

- Java 11 or later
- Maven

## How to Run

1. Clone the repository.
2. Navigate to the project directory.
3. Run the application using:

   ```bash
   mvn spring-boot:run

## Example Request:
curl -X POST "http://localhost:8080/api/supplier/query" -d "location=India&natureOfBusiness=small_scale&manufacturingProcesses=3d_printing&limit=5"
