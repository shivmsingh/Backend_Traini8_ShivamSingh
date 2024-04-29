FROM openjdk:21-jdk

COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/home/app/target/Traini8-0.0.1-SNAPSHOT.jar"]