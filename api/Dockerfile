FROM amazoncorretto:17 AS builder

COPY gradlew .
COPY build.gradle .
COPY settings.gradle .
COPY gradle gradle
COPY src src


RUN chmod +x gradlew
COPY . .
RUN ./gradlew build

#################################################################

FROM amazoncorretto:17

# docker port open
EXPOSE 8080

# copy build file
# cicd-0.0.1-SNAPSHOT -> 파라미터로 대체 가능 할 듯
COPY --from=builder ./build/libs/cicd-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]