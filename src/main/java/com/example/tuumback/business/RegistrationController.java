package com.example.tuumback.business;

import com.example.tuumback.business.dto.RegistrationRequest;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.jmx.export.annotation.ManagedOperationParameters;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class RegistrationController {

    private RegistrationService registrationService;

    @PostMapping("/registration")
    // registreerib uue kasutaja
    public void registerNewCustomer(@RequestBody RegistrationRequest registrationRequest) {
        registrationService.registerNewCustomer(registrationRequest);

    }



        // toob alt uue kasutaja ID ja konto ID ja kontojäägi}


}

