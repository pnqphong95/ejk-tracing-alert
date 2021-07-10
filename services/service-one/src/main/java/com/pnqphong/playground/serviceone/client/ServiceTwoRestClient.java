package com.pnqphong.playground.serviceone.client;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "servicetwo")
public interface ServiceTwoRestClient {
    
    @GET
    @Path("/hello")
    public String sayHello();

}
