package com.example.tuumback.domain.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AccountRepository extends JpaRepository<Account, Integer> {

    @Query("""
            select a from Account a
            where a.id = :accountId and a.customer.id = :customerId and a.currencies.currency = :currency and a.availableAmount = :availableAmout""")
    Account toRegistrationInfo(Integer accountId, Integer customerId, String currency, Integer availableAmount);
}