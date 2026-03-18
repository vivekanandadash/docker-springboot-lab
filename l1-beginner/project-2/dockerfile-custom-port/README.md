# 📦 Project 2 - Dockerfile Custom Port (L1 Beginner)

## 📌 Level

L1 - Beginner

---

## 🎯 Objective

Learn how to configure a custom port in a Spring Boot application and expose it using Docker port mapping.

---

## 🧠 Concepts Covered

* Changing Spring Boot default port
* Dockerfile basics
* Port mapping in Docker
* Difference between:

  * Application port
  * Container port
  * Host port

---

## ⚙️ Application Configuration

Spring Boot runs on a custom port:

```properties
server.port=9090
```

---

## 🐳 Dockerfile

```dockerfile
FROM openjdk:17
COPY target/simple-rest-api.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
```

---

## 🚀 How to Run

### 1. Build the JAR

```bash
mvn clean package
```

### 2. Build Docker Image

```bash
docker build -t vivek/l1-project2-custom-port .
```

### 3. Run Container

```bash
docker run -p 9091:9090 vivek/l1-project2-custom-port
```

---

## 🌐 Access the Application

Open in browser:

```
http://localhost:9091/hello
```

---

## 🔥 Port Mapping Explained

```bash
-p 9091:9090
```

* **9090** → Inside container (Spring Boot app)
* **9091** → Host machine (your system)

Flow:

```
Browser → localhost:9091 → Docker → container:9090 → Spring Boot
```

---

## ⚠️ Common Mistakes

❌ Using wrong port mapping
❌ Forgetting to change `server.port`
❌ Trying to access wrong port (9090 instead of 9091)

---

## 📚 What I Learned

* How Docker exposes applications using port mapping
* Why different ports are used in real-world systems
* How multiple applications run on the same machine using different host ports

---

## 🎯 Key Takeaway

👉 Containers can run on the same internal port, but must use different host ports to avoid conflicts.

---

## 🚀 Next Step

Move to:
**Project 3 - Environment Variables**
