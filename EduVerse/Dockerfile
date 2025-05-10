FROM eclipse-temurin:21-jdk-jammy
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
COPY . /app
WORKDIR /app
EXPOSE 8080
ENTRYPOINT ["./mvnw","spring-boot:run"]