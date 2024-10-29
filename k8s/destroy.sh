#!/bin/bash

# Navigate to the base directory
cd ~/IdeaProjects/market/k8s

# Loop through all directories starting with "service"
for dir in service*; do
    if [ -d "$dir" ]; then
        cd "$dir"
        for file in $(find . -name "*.yaml"); do
            kubectl delete -f "$file"
        done
        cd ..
    fi
done

kubectl delete -f ingress.yaml