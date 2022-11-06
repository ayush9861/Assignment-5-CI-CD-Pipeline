FROM openjdk:8
ADD target/spring-boot-docker-image14.jar spring-boot-docker-image14.jar
ARG JAR_FILE=target/*.jar
WORKDIR /opt/spring-boot-docker-image14
COPY ${JAR_FILE} spring-boot-docker-image14.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","/spring-boot-docker-image14.jar"]