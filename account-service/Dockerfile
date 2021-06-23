FROM openjdk:8-jdk-alpine
ADD target/account-service-*.jar account-service.jar
EXPOSE 9000
ENTRYPOINT ["java", "-jar","-Xms256m","-Xmx2048m","/account-service.jar"]
