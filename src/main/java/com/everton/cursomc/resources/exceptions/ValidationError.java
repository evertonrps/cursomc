package com.everton.cursomc.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

/**
 * ValidationError
 */
public class ValidationError extends StandardError {

    private static final long serialVersionUID = 1L;

    private List<FieldMessage> errors = new ArrayList<>();

    public ValidationError() {
    }

    public List<FieldMessage> getErros() {
        return errors;
    }

    public void addError(String fieldName, String message)
    {
        errors.add(new FieldMessage(fieldName, message));
    }

    public ValidationError(Integer status, String msg, Long timeStamp) {
        super(status, msg, timeStamp);
    }

    
}