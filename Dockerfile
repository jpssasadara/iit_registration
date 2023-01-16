FROM openjdk:8
EXPOSE 8080
ADD target/springboot-mongo-atlas-registration-stage.jar springboot-mongo-atlas-registration-stage.jar
ENTRYPOINT ["java","-jar","/springboot-mongo-atlas-registration-stage.jar"]