FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Update package repositories and install curl
RUN apt-get update && \
    apt-get install -y curl && \
    rm -rf /var/lib/apt/lists/*

# Copy the built JAR file from the target directory into the container
COPY target/authentication-service-0.0.1-SNAPSHOT.jar app.jar

# Expose ports (9090 for application, 5005 for debugging)
EXPOSE 9090
EXPOSE 5005

# Command to run the application
ENTRYPOINT ["java", "-jar", "authentication-service-0.0.1-SNAPSHOT.jar"]
