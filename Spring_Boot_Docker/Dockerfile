FROM openjdk:17

COPY target/spring_app_docker.jar /usr/app/

WORKDIR /usr/app

ENTRYPOINT [ "java", "-jar", "spring_app_docker.jar" ]