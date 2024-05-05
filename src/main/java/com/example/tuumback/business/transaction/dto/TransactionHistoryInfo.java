package com.example.tuumback.business.transaction.dto;

import com.example.tuumback.domain.transaction.TransactionHistory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link TransactionHistory}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionHistoryInfo implements Serializable {
    private Integer transactionId;
    private Integer accountId;
    //private String accountCurrency;
   // private String transactionDirection;
   // private String transactionDescripiton;
    private Integer transactionAmount;
}