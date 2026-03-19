FROM eclipse-temurin:21
WORKDIR /app
COPY target/dockerfile-custom-port-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 9090
ENV JAVA_OPTS=""
ENTRYPOINT ["java", "-jar", "app.jar"]

