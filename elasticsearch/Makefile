default: install

RELEASE := 7.13.2
NAMESPACE := demo-ejk

install:
	helm install elasticsearch elastic/elasticsearch --values values.yaml --version ${RELEASE} --namespace=${NAMESPACE} --create-namespace
uninstall:
	helm uninstall elasticsearch --namespace=${NAMESPACE}