# Step 1: Build & Package the jar
ARG APP_BUILD_LOCATION=/usr/src/app
FROM maven:3.8.4-eclipse-temurin-17-alpine AS build
COPY src ${APP_BUILD_LOCATION}/src
COPY pom.xml ${APP_BUILD_LOCATION}
# TODO: Decouple from hardcoded jar version. Prevent clean maven repo checkout at each build.
RUN mvn -f ${APP_BUILD_LOCATION}/pom.xml clean package \
  && mkdir target/dependency \
  && cd target/dependency \
  && jar -xf ../will-change-later-1.0.0.jar

# Step 2: Prepare actual image
FROM eclipse-temurin:17-jre-alpine

# Run app with user privileges to mitigate risk
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

# Separate dependencies and app class files to different layers to improve performance
ARG DEPENDENCY=target/dependency
COPY --from=build ${APP_BUILD_LOCATION}/${DEPENDENCY}/BOOT-INF/lib /will-change-later/lib
COPY --from=build ${APP_BUILD_LOCATION}/${DEPENDENCY}/META-INF /will-change-later/META-INF
COPY --from=build ${APP_BUILD_LOCATION}/${DEPENDENCY}/BOOT-INF/classes /will-change-later

EXPOSE 8080

ENTRYPOINT ["java","-cp","will-change-later:will-change-later/lib/*","org.dawiddc.willchangelater.WillChangeLaterApplication"]
