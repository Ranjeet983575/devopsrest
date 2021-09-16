FROM openjdk:8
EXPOSE 8095
ADD target/devopsrestapi.jar devopsrestapi.jar
ENTRYPOINT ["java","-jar","/devopsrestapi.jar"]
