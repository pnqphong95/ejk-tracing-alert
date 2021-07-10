package com.pnqphong.playground.servicetwo.client;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "servicethree")
public interface ServiceThreeRestClient {
    
    @GET
    @Path("/hello")
    public String sayHello();

}
