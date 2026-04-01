# Estagio 1: Build (Compila o codigo com Maven e Java 21)
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Estagio 2: Run (Roda o arquivo .jar com Java 21)
FROM eclipse-temurin:21-jdk-jammy
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]