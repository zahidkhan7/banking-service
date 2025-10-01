package com.zad.eng.excellence.poc.handler;

import com.zad.eng.excellence.poc.model.FailureResponse;
import com.zad.eng.excellence.poc.exception.DataNotAvailableException;
import com.zad.eng.excellence.poc.exception.CustomerNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Handle customer-related exceptions (e.g., invalid customer ID)
     */
    @ExceptionHandler({CustomerNotFoundException.class, DataNotAvailableException.class})
    public ResponseEntity<FailureResponse> handleCustomerException(RuntimeException ex) {
        FailureResponse.ErrorMessage errmsg = new FailureResponse.ErrorMessage(
                ex.getMessage(), // Arabic message
                ex.getMessage()  // English message
        );

        FailureResponse failureResponse = new FailureResponse(
                0,      // oprstatus
                "1",    // returnCode indicating failure
                errmsg
        );

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(failureResponse);
    }

    /**
     * Handle generic exceptions
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<FailureResponse> handleGlobalException(Exception ex) {
        FailureResponse.ErrorMessage errmsg = new FailureResponse.ErrorMessage(
                ex.getMessage(), // Arabic message
                ex.getMessage()  // English message
        );

        FailureResponse failureResponse = new FailureResponse(
                0,
                "1",
                errmsg
        );

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(failureResponse);
    }
}
