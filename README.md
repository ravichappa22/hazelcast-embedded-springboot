See the guide [here](https://guides.hazelcast.org/hazelcast-embedded-springboot).

minikube start --container-runtime=docker

1)install minikube
2)install kubectl
3)enable minikube addons --list
4)minikube addons configure registry-creds
5)Access the UI from minikuber -url

app deloyment to kube
1)build the final application
2)create docker image
3)Push this to local minikube restirstry, by repointing local 5000 port of docker to push to minikuber registry
  a) minikube addons enable registry
  b) docker run --rm -it --network=host alpine ash -c "apk add socat && socat TCP-LISTEN:5000,reuseaddr,fork TCP:$(minikube ip):5000"
  c) docker tag chapparavi22/hazelcast-spring-boot localhost:5000/hazelcast-spring-boot
  d) docker push localhost:5000/hazelcast-spring-boot
  
pushing image to minikube
 1)eval $(minikube docker-env)
 2)docker build -t hazelcast-spring-boot .
 3)push image using cache command - minikube cache add hazelcast-spring-boot:latest   OR minikube image load hazelcast-spring-boot:latest
 4)reload cache when new imaage pushed - minikube cache reload OR minikube image ls
