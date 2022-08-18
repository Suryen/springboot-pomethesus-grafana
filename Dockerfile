FROM openjdk:8-jdk-alpine
EXPOSE 6301
ARG JAR=springbootapp-actuator-prometheus-grafana-0.0.1-SNAPSHOT.jar
COPY target/$JAR /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
