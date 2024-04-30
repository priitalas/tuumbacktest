package com.example.tuumback.business;

import com.example.tuumback.business.dto.RegistrationRequest;
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


    public void registerNewCustomer(RegistrationRequest registrationRequest) {
        boolean customerIdExists = customerRepository.customerIdExists(registrationRequest.getCustomerId());
        ValidationService.validateCustomerIdAvailable(customerIdExists);
        Customer customer = customerMapper.toCustomer(registrationRequest);
        customerRepository.save(customer);
        Country country = countryMapper.toCountry(registrationRequest);
        countryRepository.save(country);
        Currency currency = currencyMapper.toCurrency(registrationRequest);
        currencyRepository.save(currency);
    }


    public void getNewCustomerInfo(Integer customerId) {

    }
}
