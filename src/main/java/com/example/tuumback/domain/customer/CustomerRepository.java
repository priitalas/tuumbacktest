package com.example.tuumback.domain.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {



    @Query("select (count(c) > 0) from Customer c where c.personalId = :personalId")
    boolean personalIdExists(Integer personalId);

    @Query("select c from Customer c where c.personalId = ?1")
    Customer getNewCustomerInfo(Integer personalId);


}