default: install

RELEASE := 0.46.4
NAMESPACE := demo-ejk

install:
	helm install jaeger jaegertracing/jaeger --values values.yaml --version ${RELEASE} --namespace=${NAMESPACE} --create-namespace
uninstall:
	helm uninstall jaeger --namespace=${NAMESPACE}