package com.example.tuumback.business;

import com.example.tuumback.business.dto.RegistrationRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
public class RegistrationController {

    private RegistrationService registrationService;

    @PostMapping("/registration")
    // registreerib uue kasutaja
    public void registerNewCustomer(@RequestBody RegistrationRequest registrationRequest) {
        registrationService.registerNewCustomer(registrationRequest);

    }

    @GetMapping("/registration")
    public void getNewCustomerInfo(@PathVariable Integer customerId) {
        registrationService.getNewCustomerInfo(customerId);
    }

        // toob alt uue kasutaja ID ja konto ID ja kontojäägi}


}

