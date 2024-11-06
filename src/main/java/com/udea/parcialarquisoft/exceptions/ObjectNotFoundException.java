package com.udea.parcialarquisoft.exceptions;

public class ObjectNotFoundException extends RestException {

    public ObjectNotFoundException(String message) {
        super(message);
    }

    public ObjectNotFoundException(ErrorMessage errorMessage) {
        super(errorMessage);
    }
    
}
