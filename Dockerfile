# Use a base image with Java installed
FROM openjdk:9-b181-jdk-slim
#FROM openjdk:18-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the Gradle build files
COPY build.gradle .
COPY gradle ./gradle
COPY settings.gradle .

# Copy the source code
COPY src ./src

# Build the Java application
#RUN gradle build
#chmod +x gradlew
RUN ./gradle build
# Set the command to run the Java application
CMD ["java", "-jar", "build/libs/Kafka-Producer-User-0.1.0.jar"]