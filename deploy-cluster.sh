#!/usr/bin/env bash

set -euo pipefail

# Create namespace sample-cluster
kubectl apply -f sample-cluster-namespace.yml

# Spawn MQ instance
kubectl apply -f rabbitmq/rabbitmq-deployment.yml

# Spawn Spring Boot app
kubectl apply -f will-change-later/will-change-later-deployment.yml

# TODO: Add --rebuild option to rebuild nested images and apply changes
