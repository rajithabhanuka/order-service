First run below command to connect minikube with docker
```
eval $(minikube docker-env)
```

Create docker image using 
```
docker build -t order-service:1.1 .
```

To create the stack rub below command from the project root directory
```
kubectl apply -k ./kubernetes/application/
```

To delete the stack rub below command from the project root directory
```
kubectl delete -k ./kubernetes/application/
```

Find the IP address of ingress controller using blow command
```
kubectl get ingress app-ingress --watch
```

add it to the 
```
/etc/hosts
```

For overlays and patching use below commands

```
kubectl apply -k ./kubernetes/environments/development
kubectl apply -k ./kubernetes/environments/production
```