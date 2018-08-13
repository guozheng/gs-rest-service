# Demo app to build a REST web service API with Spring Boot and Docker

This is a fork from original [gs-rest-service](https://github.com/spring-guides/gs-rest-service). Changes are made to the `initial` directory.

## Run the demo app

To run the app, simply go to `initial` directory and run the commands:

```text
cd initial
mvn package docker:build docker:run
```

Now, in your Web browser enter: `http://localhost:8080/greeting?name=foo`, it shows a greeting message in JSON.