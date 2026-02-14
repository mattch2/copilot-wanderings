# copilot-wanderings

Test repository to experiment with GitHub Copilot custom agents and MCP servers.

## Overview

This is a Spring Boot application built with Java 21 and Maven, designed to demonstrate CI/CD workflows and GitHub Copilot custom agents.

## Technologies

- **Java 21**: Latest LTS version of Java
- **Spring Boot 3.x**: Modern Java framework for building web applications
- **Maven**: Build automation and dependency management
- **Maven Wrapper**: Ensures consistent Maven version across environments

## Prerequisites

- Java 21 or higher
- Maven (or use the included Maven Wrapper)

## Building the Project

Using Maven Wrapper (recommended):

```bash
./mvnw clean install
```

Using local Maven:

```bash
mvn clean install
```

## Running the Application

```bash
./mvnw spring-boot:run
```

The application will start on `http://localhost:8080`

## API Endpoints

- `GET /api/hello` - Returns a simple hello world message

## Testing

Run all tests:

```bash
./mvnw test
```

## CI/CD

This project includes GitHub Actions workflows for:
- **CI**: Automated build and test on every push and pull request
- **CD**: Automated deployment process

## GitHub Copilot Agent

This repository includes a custom GitHub Copilot agent configuration to assist with development tasks specific to this Spring Boot project.
