FROM openjdk:latest
WORKDIR /usr/src/app
COPY ./src/main/java .
RUN javac -sourcepath . -d out ./org/example/Program.java
WORKDIR /usr/src/app/out
ENTRYPOINT ["java", "org.example.Program"]