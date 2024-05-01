package com.example.tuumback.business;

import com.example.tuumback.business.dto.RegistrationInfo;
import com.example.tuumback.business.dto.RegistrationRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
public class RegistrationController {

    private RegistrationService registrationService;

    @PostMapping("/registration")
    public void registerNewCustomer(@RequestBody RegistrationRequest registrationRequest) {
        registrationService.registerNewCustomer(registrationRequest);

    }

    @GetMapping("/registration")
    public RegistrationInfo getNewCustomerInfo(@PathVariable Integer customerId) {
        RegistrationInfo registrationInfo = registrationService.getNewCustomerInfo(customerId);
        return registrationInfo;
    }




}

