default: install
install:
	$(MAKE) -C elasticsearch install
	$(MAKE) -C jaeger install
	$(MAKE) -C kibana install
uninstall:
	$(MAKE) -C elasticsearch uninstall
	$(MAKE) -C jaeger uninstall
	$(MAKE) -C kibana uninstall