#!/usr/bin/env bash

set -euo pipefail

# Delete whole namespace
kubectl delete namespace sample-cluster-namespace
