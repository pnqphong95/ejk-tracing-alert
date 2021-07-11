package com.pnqphong.playground.servicetwo.client;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.pnqphong.playground.servicetwo.client.exception.MyException;
import com.pnqphong.playground.servicetwo.client.exception.MyExceptionMapper;

import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "servicethree")
@RegisterProvider(MyExceptionMapper.class)
public interface ServiceThreeRestClient {
    
    @GET
    @Path("/hello")
    public String sayHello() throws MyException;

}
