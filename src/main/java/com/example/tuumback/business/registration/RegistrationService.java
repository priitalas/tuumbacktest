package com.example.tuumback.business.registration;

import com.example.tuumback.business.registration.dto.RegistrationInfo;
import com.example.tuumback.business.registration.dto.RegistrationRequest;
import com.example.tuumback.domain.account.Account;
import com.example.tuumback.domain.account.AccountMapper;
import com.example.tuumback.domain.account.AccountRepository;
import com.example.tuumback.domain.country.Country;
import com.example.tuumback.domain.country.CountryMapper;
import com.example.tuumback.domain.country.CountryRepository;
import com.example.tuumback.domain.currency.Currency;
import com.example.tuumback.domain.currency.CurrencyMapper;
import com.example.tuumback.domain.currency.CurrencyRepository;
import com.example.tuumback.domain.customer.Customer;
import com.example.tuumback.domain.customer.CustomerMapper;
import com.example.tuumback.domain.customer.CustomerRepository;
import com.example.tuumback.infrastructure.validation.ValidationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class RegistrationService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;
    private final CountryRepository countryRepository;
    private final CountryMapper countryMapper;
    private final CurrencyRepository currencyRepository;
    private final CurrencyMapper currencyMapper;
    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;


    public void registerNewCustomer(RegistrationInfo registrationInfo) {
        boolean personalIdExists = customerRepository.personalIdExists(registrationInfo.getPersonalId());
        ValidationService.validateCustomerIdAvailable(personalIdExists);
        Customer customer = customerMapper.toCustomer(registrationInfo);
        customerRepository.save(customer);
        Country country = countryMapper.toCountry(registrationInfo);
        countryRepository.save(country);
        boolean currencyNotExists = currencyRepository.invalidCurrency(registrationInfo.getCurrency());
        ValidationService.currencyNotExists(currencyNotExists);
        Currency currency = currencyMapper.toCurrency(registrationInfo);
        currency.setCurrency(toString());

    }


    public RegistrationRequest getNewCustomerInfo(Integer personalId) {
        Customer customer = customerRepository.getNewCustomerInfo(personalId);
        RegistrationRequest registrationRequest = customerMapper.toRegistrationInfo(customer);
        Account account = accountRepository.getRegistrationInfo(registrationRequest.getAccountId());
        registrationRequest.setAccountId(account.getId());
        registrationRequest.setAvailableAmount(account.getAvailableAmount());

        return registrationRequest;
    }
}
