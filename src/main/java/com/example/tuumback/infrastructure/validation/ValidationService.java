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

    public static Account getValidexistingAccount(Optional<Account> optionalAccount) {
        if (optionalAccount.isEmpty()) {
            throw new ForbiddenException(INCORRECT_CREDENTIALS.getMessage(), INCORRECT_CREDENTIALS.getErrorCode());
        }
        return optionalAccount.get();
    }
}

