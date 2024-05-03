package com.example.tuumback.business.registration;

import com.example.tuumback.business.registration.dto.RegistrationInfo;
import com.example.tuumback.business.registration.dto.RegistrationRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
public class RegistrationController {
    private RegistrationService registrationService;

    @PostMapping("/registration")
    public void registerNewCustomer(@RequestBody RegistrationInfo registrationInfo) {
        registrationService.registerNewCustomer(registrationInfo);
    }

    @GetMapping("/registration")
    public RegistrationRequest getNewCustomerInfo(@RequestParam Integer personalId) {
       RegistrationRequest registrationRequest = registrationService.getNewCustomerInfo(personalId);
        return registrationRequest;
    }




}

