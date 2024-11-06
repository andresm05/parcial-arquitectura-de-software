package com.udea.parcialarquisoft.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RestException extends Exception {
    
    private ErrorMessage errorMessage;

    public RestException(String message) {
        super(message);
    }


    public RestException(ErrorMessage errorMessage) {
        super(errorMessage.getMessage());
        this.errorMessage = errorMessage;
    }
}
