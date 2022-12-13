FROM openjdk:8-jdk-alpine
MAINTAINER AhmedBouabda
COPY target\ExamThourayaS2-0.0.1-SNAPSHOT.jar /usr/src/ExamThourayaS2-0.0.1-SNAPSHOT.jar/
ENTRYPOINT ["java","-jar","ExamThourayaS2-0.0.1-SNAPSHOT.jar"]