package com.pnqphong.playground.servicetwo;

import java.util.Random;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.WebApplicationException;

import com.pnqphong.playground.servicetwo.client.ServiceThreeRestClient;
import com.pnqphong.playground.servicetwo.client.exception.MyException;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/servicetwo")
public class MyResource {

    @Inject
    @RestClient
    private ServiceThreeRestClient serviceThree;

    @GET
    @Path("/hello")
    public String sayHello() {
        boolean error = new Random().nextBoolean();
        if (!error) {
            StringBuilder message = new StringBuilder("Service Two: Hello -> ");
            try {
                message.append(serviceThree.sayHello());
            } catch (MyException e) {
                message.append("Service Three got error -> ");
            }
            return message.toString();
        }
        throw new WebApplicationException("Unexpected error from service two.");
    }

}
