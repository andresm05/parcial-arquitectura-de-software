package com.udea.parcialarquisoft.exceptions;

public class ObjectAlreadyExistException extends RestException {

    public ObjectAlreadyExistException(String message) {
        super(message);
    }

    public ObjectAlreadyExistException(ErrorMessage errorMessage) {
        super(errorMessage);
    }
    
}
