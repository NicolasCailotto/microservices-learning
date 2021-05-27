#pull base image
FROM openjdk:8-jre-alpine

#maintainer
MAINTAINER cailotto.nicolas@gmail.com

#expose port 8080
EXPOSE 8080

ADD target/*.jar /eureka-server.jar

#default command
CMD java -jar /eureka-server.jar
