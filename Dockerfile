# === Stage 1: Build the app ===
FROM eclipse-temurin:21-jdk AS build

# Set working directory
WORKDIR /app

# Install gradle dependencies and build
COPY . .
RUN ./gradlew clean bootJar --no-daemon

# === Stage 2: Run the app ===
FROM eclipse-temurin:21-jdk

WORKDIR /app
EXPOSE 8080

COPY --from=build /app/build/libs/backend-0.0.1-SNAPSHOT.jar backend.jar

ENTRYPOINT ["java", "-jar", "backend.jar"]
