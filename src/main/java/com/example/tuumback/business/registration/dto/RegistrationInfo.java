package com.example.tuumback.business.registration.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link com.example.tuumback.domain.customer.Customer}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationInfo implements Serializable {
    private String countryName;
    private String currency;
    @NotNull
    private Integer personalId;
}