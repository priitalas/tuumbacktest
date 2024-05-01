package com.example.tuumback.domain.currency;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CurrencyRepository extends JpaRepository<Currency, Integer> {
    @Query("select (count(c) > 0) from Currency c where c.currency = :currency")
    boolean invalidCurrency(String currency);
}