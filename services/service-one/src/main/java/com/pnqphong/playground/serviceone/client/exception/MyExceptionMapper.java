package com.pnqphong.playground.serviceone.client.exception;

import javax.ws.rs.core.Response;

import org.eclipse.microprofile.rest.client.ext.ResponseExceptionMapper;

public class MyExceptionMapper implements ResponseExceptionMapper<MyException> {

    @Override
    public MyException toThrowable(Response response) {
        return new MyException("Unexpected exception from rest call.");
    }

}
