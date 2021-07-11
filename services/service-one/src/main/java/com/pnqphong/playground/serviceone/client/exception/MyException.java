package com.pnqphong.playground.serviceone.client.exception;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response.Status;

public class MyException extends WebApplicationException {

    public MyException(String message, Status status) {
        super(message, status);
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

}
