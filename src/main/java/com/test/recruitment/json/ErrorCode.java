package com.test.recruitment.json;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * Error code
 */
@AllArgsConstructor
public enum ErrorCode {

    NOT_FOUND_ACCOUNT(HttpStatus.NOT_FOUND),
    NOT_FOUND_TRANSACTION(HttpStatus.NOT_FOUND),
    FORBIDDEN_TRANSACTION(HttpStatus.FORBIDDEN);

    @Getter
    private HttpStatus httpStatus;

}
