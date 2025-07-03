# Use Maven to build app
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Use lighter image for runtime
FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /app/target/Stockscrenner-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
