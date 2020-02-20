FROM openjdk:8
#WORKDIR usr/src
#ADD ./target/AuthenticationService-0.0.1-SNAPSHOT.jar /usr/src/AuthenticationService-0.0.1-SNAPSHOT.jar
#RUN chmod +x /usr/src/AuthenticationService-0.0.1-SNAPSHOT.jar
#EXPOSE 8089
#ENTRYPOINT ["java","-Xmx200m", "-jar", "/usr/src/AuthenticationService-0.0.1-SNAPSHOT.jar"]
ADD target/springmvcexample.jar springmvcexample.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "springmvcexample.jar"]