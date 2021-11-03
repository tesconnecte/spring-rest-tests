package com.test.recruitment.exception;

import org.springframework.http.HttpStatus;

/**
 * Service exception
 */
public class CustomHttpException extends RuntimeException {

    private static final long serialVersionUID = 8303256484065597037L;

    private final HttpStatus errorCode;

    private final String message;

    public CustomHttpException(HttpStatus errorCode) {
        this(errorCode, null);
    }

    public CustomHttpException(HttpStatus errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public HttpStatus getErrorCode() {
        return errorCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
