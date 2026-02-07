# Use Java 17 base image
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy Maven wrapper + project files
COPY . .

# Build the application inside Docker
RUN ./mvnw clean package -DskipTests

# Run the jar file
CMD ["java", "-jar", "target/app.jar"]

# Expose port used by Spring Boot
EXPOSE 8080
