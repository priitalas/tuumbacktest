package com.example.tuumback.infrastructure.validation;

import com.example.tuumback.domain.customer.Customer;
import com.example.tuumback.infrastructure.exceptions.ForbiddenException;

import static com.example.tuumback.infrastructure.error.Error.CUSTOMER_UNAVAILABLE;

public class ValidationService {

    public static void validateCustomerIdAvailable(boolean customerIdExists) {
        if (customerIdExists) {
            throw new ForbiddenException(CUSTOMER_UNAVAILABLE.getMessage(), CUSTOMER_UNAVAILABLE.getErrorCode());
        }
    }
}

