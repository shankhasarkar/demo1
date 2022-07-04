FROM openjdk:8-jdk-alpine
MAINTAINER baeldung.com
COPY target/MyCloudDemo-1.0-SNAPSHOT.jar MyCloudDemo-1.0.jar
ENTRYPOINT ["java","-jar","/MyCloudDemo-1.0.jar"]
