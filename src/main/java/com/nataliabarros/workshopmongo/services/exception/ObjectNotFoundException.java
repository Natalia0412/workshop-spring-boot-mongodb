package com.nataliabarros.workshopmongo.services.exception;

public class ObjectNotFoundException extends RuntimeException{
    private static final long serialVersionID=1l;
    public ObjectNotFoundException(String msg){
        super(msg);
    }

}
