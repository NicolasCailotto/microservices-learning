#pull base image
FROM openjdk:8-jre-alpine

#maintainer
MAINTAINER cailotto.nicolas@gmail.com

#expose port 8080
EXPOSE 8080

ADD target/*.jar /zull-api-gateway.jar

#default command
CMD java -jar /zull-api-gateway.jar
