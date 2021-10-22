package com.test.recruitment.exception;

import com.test.recruitment.json.ErrorCode;
import lombok.Getter;

/**
 * Service exception
 */
public class ServiceException extends RuntimeException {

    private static final long serialVersionUID = 8303256484065597037L;

    @Getter
    private final ErrorCode errorCode;

    @Getter
    private final String message;

    public ServiceException(ErrorCode errorCode) {
        this(errorCode, null);
    }

    public ServiceException(ErrorCode errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

}
