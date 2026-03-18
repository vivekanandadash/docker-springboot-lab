# Use OpenJDK 21 as the base image
FROM eclipse-temurin:21

# Set the working directory in the image
WORKDIR /app

# Copy the jar file from host file system to the image file system
COPY target/java-docker-app-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that Spring Boot runs on
EXPOSE 8080

# Set environment variables
ENV JAVA_OPTS=""

# Run the jar file to start the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]