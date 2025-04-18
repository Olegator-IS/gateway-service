# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

EXPOSE 8080

WORKDIR /app

COPY build/libs/gateway-service.jar /app/gateway-service.jar

ENTRYPOINT ["java", "-Xms512m", "-Xmx1024m", "-XX:+UseG1GC", "-XX:MaxGCPauseMillis=200", "-jar", "gateway-service.jar"]