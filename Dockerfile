FROM openjdk:17

VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
#COPY bin/newrelic/newrelic.jar newrelic.jar
ENTRYPOINT ["java","-jar","/app.jar"]
#ENTRYPOINT ["java","-javaagent:/newrelic.jar","-jar","/app.jar"]