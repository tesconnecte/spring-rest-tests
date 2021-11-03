package com.test.recruitment.exception;

import com.test.recruitment.json.ErrorResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Exception handler
 */
@ControllerAdvice
public class CustomExceptionHandler {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    /**
     * Handle {@link CustomHttpException}
     *
     * @param e exception
     * @return error response
     */
    @ExceptionHandler(CustomHttpException.class)
    @ResponseBody
    public ResponseEntity<ErrorResponse> handleServiceException(CustomHttpException e) {

        log.error("Error : " + e.getMessage());

        return ResponseEntity.status(e.getErrorCode().value()).body(new ErrorResponse(e.getErrorCode(), e.getMessage()));
    }

}
