FROM openjdk:latest
COPY ./target/News-API-1.0-SNAPSHOT.jar News-API-1.0-SNAPSHOT.jar
CMD ["java", "-jar","News-API-1.0-SNAPSHOT.jar"]