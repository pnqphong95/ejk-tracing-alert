package com.pnqphong.playground.serviceone.client;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.pnqphong.playground.serviceone.client.exception.MyException;
import com.pnqphong.playground.serviceone.client.exception.MyExceptionMapper;

import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "servicetwo")
@RegisterProvider(MyExceptionMapper.class)
public interface ServiceTwoRestClient {
    
    @GET
    @Path("/hello")
    public String sayHello() throws MyException;

}
