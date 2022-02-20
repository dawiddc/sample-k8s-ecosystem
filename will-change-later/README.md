# Will Change Later 1.0.0

Dockerized stub project created just for fiddling with code

[![Sonarcloud Status](https://sonarcloud.io/api/project_badges/measure?project=dawiddc_sample-k8s-ecosystem&metric=alert_status)](https://sonarcloud.io/dashboard?id=dawiddc_sample-k8s-ecosystem)

## Getting Started

---

### Docker

This app is ready to work with Docker

#### Requirements

[Docker](https://docs.docker.com/install/) installed.

#### Build & Run

To run containerized app first build the image:

```shell
docker build -t dawiddc/will-change-later
```

After the image is built, run the container:

```shell
docker run --it -p 8080:8080 dawiddc/will-change-later
```

---

### Maven

To run the app locally via Maven just run below command:

```shell
./mvnw package && ./mvnw spring-boot:run
```

---
Pull requests are welcome.
