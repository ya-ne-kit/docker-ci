FROM ubuntu
RUN apt-get update && apt-get install -y \
    default-jre \
    default-jdk
COPY ./out/artifacts/my_app_jar/*.jar /app/app.jar
WORKDIR /app

CMD ["java", "-jar", "app.jar"]