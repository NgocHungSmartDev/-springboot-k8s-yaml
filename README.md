# clean and build file jar: 
	* mvn clean package -DskipTests
	* mvn install
	* docker build -t springboot-k8s-demo:2.0 .
	
# create deployment
	* kubectl apply -f deployment.yaml (kubectl delete -f deployment.yaml)
	* kubectl get pods
	
# create service
	* kubectl apply -f service.yaml
	* kubectl get nodes -o wide