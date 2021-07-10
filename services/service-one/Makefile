default: install

NAMESPACE := demo-ejk

install:
	mvn clean package -Dquarkus.container-image.build=true -DskipTests
	kubectl apply -f target/kubernetes/kubernetes.yml -n ${NAMESPACE}
uninstall:
	kubectl delete -f target/kubernetes/kubernetes.yml -n ${NAMESPACE}
	mvn clean