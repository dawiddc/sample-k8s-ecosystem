#!/usr/bin/env bash

set -euo pipefail

# Create namespace sample-cluster
kubectl apply -f sample-cluster-namespace.yml

# Spawn MQ instance
# TODO: Create RabbitMQ instance

# Spawn Spring Boot app
kubectl apply -f will-change-later/will-change-later-deployment.yml
