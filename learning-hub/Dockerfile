# Use a base image with a JDK installed
FROM eclipse-temurin:21-jdk-alpine
  
  # Set the working directory inside the container
WORKDIR /app
  
  # Copy the project’s JAR file into the container
COPY target/learning-hub-0.0.1-SNAPSHOT.jar /app/learning-hub-0.0.1-SNAPSHOT.jar
  
  # Expose the port the app runs on
EXPOSE 9091
  
  # Run the application
ENTRYPOINT ["java", "-jar", "/app/learning-hub-0.0.1-SNAPSHOT.jar"]
