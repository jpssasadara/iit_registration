FROM openjdk:8
EXPOSE 8080
ADD target/springboot-mongo-atlas-registration.jar springboot-mongo-atlas-registration.jar
ENTRYPOINT ["java","-jar","/springboot-mongo-atlas-registration.jar"]