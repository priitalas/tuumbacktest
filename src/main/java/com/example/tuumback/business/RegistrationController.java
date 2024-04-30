package com.example.tuumback.business;

import com.example.tuumback.business.dto.RegistrationRequest;
import lombok.AllArgsConstructor;
import org.springframework.jmx.export.annotation.ManagedOperationParameters;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class RegistrationController {

    private RegistrationService registrationService;

    @GetMapping("/registration")
    public void registerNewCustomer(@RequestBody RegistrationRequest registrationRequest) {
        registrationService.registerNewCustomer(registrationRequest);

    }
}
