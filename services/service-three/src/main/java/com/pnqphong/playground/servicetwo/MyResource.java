package com.pnqphong.playground.servicetwo;

import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.WebApplicationException;

@Path("/servicethree")
public class MyResource {

    @GET
    @Path("/hello")
    public String sayHello() {
        boolean error = new Random().nextBoolean();
        if (!error) {
            return new StringBuilder("Service Three: Hello -> ").toString();
        }
        throw new WebApplicationException("Unexpected error from service three.");
    }

}
