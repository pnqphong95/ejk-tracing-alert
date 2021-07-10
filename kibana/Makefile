default: install

RELEASE := 7.13.2
NAMESPACE := demo-ejk

install:
	helm install kibana elastic/kibana --version ${RELEASE} --namespace=${NAMESPACE} --create-namespace
uninstall:
	helm uninstall kibana --namespace=${NAMESPACE}