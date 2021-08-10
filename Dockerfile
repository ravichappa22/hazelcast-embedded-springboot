FROM openjdk:8-jdk-alpine

VOLUME /tmp

ARG JAR_FILE=target/hazelcast-embedded-springboot-1.0.0.jar

ADD ${JAR_FILE} app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
