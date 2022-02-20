# Sample Kubernetes Ecosystem

This is a sample Kubernetes cluster created as a playground for fiddling with code

## Getting Started

---

### Kubernetes

#### Requirements

* [Docker](https://docs.docker.com/install/) installed.

* [Kubernetes](https://kubernetes.io/docs/setup/) set up.

Please note that this repository was developed and tested against
[Docker Desktop](https://docs.docker.com/desktop/) and its embedded k8s.

#### Getting started

<!--- TODO: Automate this step -->

* First, build the images of services required to start the cluster (described in nested README files)

* To run the cluster locally on k8s just run below deploy script:

```shell
./deploy-cluster.sh
```

* To remove whole cluster namespace, run below script:

```shell
./teardown-cluster.sh
```

---
Pull requests are welcome.
