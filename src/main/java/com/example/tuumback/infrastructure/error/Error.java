package com.example.tuumback.infrastructure.error;


import lombok.Getter;

@Getter
public enum Error {
    CUSTOMER_UNAVAILABLE("This customer Id already exists", 111),
    INVALID_CURRENCY("Invalid currency", 222);


    private final String message;
    private final int errorCode;

    Error(String message, int errorCode) {
        this.message = message;
        this.errorCode = errorCode;
    }
}
