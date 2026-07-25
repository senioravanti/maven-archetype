FROM eclipse-temurin:${javaVersion}-jdk-alpine AS build
WORKDIR /usr/local/src/app/
COPY . .

RUN apk add --no-cache maven

RUN mvn clean package -Dmaven.test.skip=true

FROM eclipse-temurin:${javaVersion}-jre-alpine
COPY --from=build /usr/local/src/app/target/*.jar /opt/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/opt/app.jar" ]