# Automated API Testing Platform

A Java-based API testing tool that sends HTTP requests, measures response time, validates HTTP status codes, and checks response content.

## Features

- Sends HTTP GET requests using Java's built-in `HttpClient`
- Measures API response time
- Validates HTTP status codes
- Checks expected content in the response body
- Displays test results as PASS or FAIL
- Prints the API response in JSON format

## Technologies Used

- Java 25
- Maven
- HTTP Client API
- JSONPlaceholder REST API

## Project Structure

```text
api-testing-platform/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── shambhavi/
│                   └── ApiTestRunner.java
├── pom.xml
└── README.md
```

## How to Run

Compile the project:

```bash
mvn compile
```

Run the application from the project root:

```bash
java -cp target/classes com.shambhavi.ApiTestRunner
```

## Sample Test Results

```text
Status Code: 200
Status Test: PASS
Response Body Test: PASS
```

## Test API

This project uses [JSONPlaceholder](https://jsonplaceholder.typicode.com/posts/1), a public test API.

## Future Improvements

- Support POST, PUT, and DELETE requests
- Allow users to enter custom API URLs
- Add automated assertions for response fields
- Generate test reports
- Add unit tests and continuous integration with GitHub Actions

## Author

Shambhavi Seth