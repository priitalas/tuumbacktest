package com.example.tuumback.domain.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Integer> {


    @Query("select a from Account a where a.customer.id = :personalId")
    Account getRegistrationInfo(Integer personalId);

    @Query("select a from Account a where a.id = :accountId")
    Optional<Account> findAccountBy(Integer accountId);

}