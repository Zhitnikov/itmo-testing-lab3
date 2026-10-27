FROM maven:3.9.6-eclipse-temurin-17-alpine

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline -B

COPY src ./src

ENTRYPOINT ["mvn", "test", "-B"]