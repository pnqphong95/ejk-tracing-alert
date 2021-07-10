package com.pnqphong.playground.serviceone;

import java.util.Random;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.WebApplicationException;

import com.pnqphong.playground.serviceone.client.ServiceTwoRestClient;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/serviceone")
public class MyResource {

    @Inject
    @RestClient
    private ServiceTwoRestClient serviceTwo;

    @GET
    @Path("/hello")
    public String sayHello() {
        boolean error = new Random().nextBoolean();
        if (!error) {
            StringBuilder message = new StringBuilder("Service One: Hello -> ");
            message.append(serviceTwo.sayHello());
            return message.toString();
        }
        throw new WebApplicationException("Unexpected error from service one.");
    }

}
