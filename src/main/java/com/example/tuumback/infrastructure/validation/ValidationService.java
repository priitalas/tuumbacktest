package com.example.tuumback.infrastructure.validation;

import com.example.tuumback.domain.account.Account;
import com.example.tuumback.infrastructure.exceptions.ForbiddenException;

import java.util.Optional;

import static com.example.tuumback.infrastructure.error.Error.*;

public class ValidationService {

    public static void validateCustomerIdAvailable(boolean customerIdExists) {
        if (customerIdExists) {
            throw new ForbiddenException(CUSTOMER_UNAVAILABLE.getMessage(), CUSTOMER_UNAVAILABLE.getErrorCode());
        }
    }

    public static void currencyNotExists(boolean currencyNotExists) {
        if (currencyNotExists){
            throw new ForbiddenException(INVALID_CURRENCY.getMessage(), INVALID_CURRENCY.getErrorCode());
        }
    }

    public static void validateAccountNotExists(boolean accountNotExists) {
        if (accountNotExists) {
            throw new ForbiddenException(ACCOUNT_NOT_FOUND.getMessage(), ACCOUNT_NOT_FOUND.getErrorCode());
        }

    }
}

