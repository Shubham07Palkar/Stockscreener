
# Use official lightweight OpenJDK 21 runtime as a base image
FROM eclipse-temurin:21-jre

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file built by Maven to the container
COPY target/Stockscrenner-0.0.1-SNAPSHOT.jar app.jar

# Expose port (optional, but helpful for readability)
EXPOSE 8080

# Define how to run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
