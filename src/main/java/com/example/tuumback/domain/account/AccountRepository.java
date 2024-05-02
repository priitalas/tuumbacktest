package com.example.tuumback.domain.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AccountRepository extends JpaRepository<Account, Integer> {


    @Query("select a from Account a where a.customer.id = ?1")
    Account getRegistrationInfo(Integer id);
}