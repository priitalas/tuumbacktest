package com.example.tuumback.business;

import com.example.tuumback.business.dto.RegistrationRequest;
import com.example.tuumback.domain.customer.Customer;
import com.example.tuumback.domain.customer.CustomerRepository;
import com.example.tuumback.infrastructure.validation.ValidationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class RegistrationService {

    private final CustomerRepository customerRepository;

    public void registerNewCustomer(RegistrationRequest registrationRequest) {
        boolean customerIdExists = customerRepository.customerIdExists(registrationRequest.getCustomerId());
        ValidationService.validateCustomerIdAvailable(customerIdExists);



    }


}
