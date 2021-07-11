package com.pnqphong.playground.serviceone;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.pnqphong.playground.serviceone.client.ServiceTwoRestClient;
import com.pnqphong.playground.serviceone.client.exception.MyException;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/serviceone")
public class MyResource {

    @Inject
    @RestClient
    private ServiceTwoRestClient serviceTwo;

    @GET
    @Path("/hello")
    public String sayHello() {
        StringBuilder message = new StringBuilder("Service One: Hello -> ");
        try {
            message.append(serviceTwo.sayHello());
        } catch (MyException e) {
            message.append("Service Two got error -> ");
        }
        return message.toString();
    }

}
