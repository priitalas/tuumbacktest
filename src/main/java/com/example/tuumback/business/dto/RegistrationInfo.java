package com.example.tuumback.business.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link com.example.tuumback.domain.account.Account}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationInfo implements Serializable {
    private Integer accountId;
    private Integer customerId;
    private String currency;
    @NotNull
    private Integer availableAmount;
}