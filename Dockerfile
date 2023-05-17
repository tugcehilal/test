FROM openjdk:17
COPY ./target/test2-0.0.1-SNAPSHOT.jar /
WORKDIR /


ADD target/test2-0.0.1-SNAPSHOT.jar  /test2-0.0.1-SNAPSHOT.jar

CMD exec java -jar test2-0.0.1-SNAPSHOT.jar