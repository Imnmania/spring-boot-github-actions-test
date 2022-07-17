FROM openjdk:11-jre
# FROM oracle-java:1.0
VOLUME /tmp
ADD target/springBootDocker-1.0.0.jar springBootDocker.jar
ENTRYPOINT ["java","-jar","/springBootDocker.jar"]
EXPOSE 8080

# FROM tomcat:9.0
# COPY target/springBootDocker-1.0.0.war /usr/local/tomcat/webapps/ROOT.war