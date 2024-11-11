# Java Docker Setup



## Prerequisites

- Docker installed on your machine. If you haven't installed Docker, follow the instructions [here](https://www.docker.com/get-started).

- A Java application (e.g., JAR file) ready to be containerized.

## Steps to Create Docker Image

### 1. **Create a `Dockerfile`**

In the root of your Java project, create a `Dockerfile` with the following content:

```Dockerfile
# Use the official OpenJDK image
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/myapp.jar .

# Expose the port your application runs on (default is 8080 for many Java apps)
EXPOSE 8080

# Set the command to run the application
CMD ["java", "-jar", "myapp.jar"]