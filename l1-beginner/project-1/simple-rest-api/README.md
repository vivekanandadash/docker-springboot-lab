# Java Docker App 🐳

## About
A simple Spring Boot REST API Dockerized and Deployed on AWS EC2.

## Tech Stack
- Java 21
- Spring Boot 3.5.11
- Maven
- Docker
- AWS EC2

## API Endpoint
GET /hello → "Hello World from docker!"

## How to Run
docker pull vivekanandadash/java-docker-app
docker run -d -p 8080:8080 vivekanandadash/java-docker-app

## Access
http://localhost:8080/hello
