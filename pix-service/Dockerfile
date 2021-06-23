FROM openjdk:8-jdk-alpine
ADD target/pix-service-*.jar pix-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","-Xms256m","-Xmx2048m","/pix-service.jar"]