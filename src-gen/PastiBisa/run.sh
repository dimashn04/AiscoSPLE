#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.pastibisa --module-path aisco.product.pastibisa -m aisco.product.pastibisa &

wait