FROM openjdk:8
EXPOSE 8080
ADD target/devopsrestapi-0.0.1.jar devopsrestapi-0.0.1.jar
ENTRYPOINT ["java","-jar","/devopsrestapi-0.0.1.jar"]
