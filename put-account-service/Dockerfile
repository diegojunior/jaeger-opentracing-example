FROM openjdk:8-jdk-alpine
ADD target/put-account-service-*.jar put-account-service.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar","-Xms256m","-Xmx2048m","/put-account-service.jar"]
