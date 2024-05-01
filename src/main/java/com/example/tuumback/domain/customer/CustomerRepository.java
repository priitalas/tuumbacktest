package com.example.tuumback.domain.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {


    @Query("select c from Customer c where c.customerId = :customerId")
    boolean customerIdExists(Integer customerId);


}