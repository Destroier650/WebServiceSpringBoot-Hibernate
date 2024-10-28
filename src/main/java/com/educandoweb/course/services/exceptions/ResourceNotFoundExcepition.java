package com.educandoweb.course.services.exceptions;

public class ResourceNotFoundExcepition extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundExcepition(Object id) {
        super("Resource not found. Id" + id);
    }

}
