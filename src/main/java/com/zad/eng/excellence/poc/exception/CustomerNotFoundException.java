package com.zad.eng.excellence.poc.exception;

/**
 * Custom exception thrown when a customer is not found.
 */
public class CustomerNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public CustomerNotFoundException() {
        super("Customer not found");
    }

    /**
     * Constructor with custom message.
     * @param message Custom error message
     */
    public CustomerNotFoundException(String message) {
        super(message);
    }
}
