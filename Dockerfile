FROM maven:3.5-jdk-8

# If you just need to have the app run locally with docker-compose then all you need it what is above.3


# If you are trying to build a container instead then what you need is below.
# Refer to docker-compose to understand.


#FROM openjdk

#ENTRYPOINT ["java", "-jar", "/usr/share/myservice/myservice.jar"]

# Add Maven dependencies (not shaded into the artifact; Docker-cached)
#ADD target/lib           /usr/share/myservice/lib
# Add the service itself
#ARG JAR_FILE
#ADD target/${JAR_FILE} /usr/share/myservice/myservice.jar