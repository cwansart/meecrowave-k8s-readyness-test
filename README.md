# Meecrowave with Kubernetes readyness check

This is a _work in progress_ project to test MicroProfile with Meecrowave and the readyness check in Kubernetes.

## How to build and run

Run the command:
```
mvn package meecrowave:run
```

After that you'll have some routes available:
 * http://localhost:8080/health
 * http://localhost:8080/health/live
 * http://localhost:8080/health/ready
 * http://localhost:8080/metrics