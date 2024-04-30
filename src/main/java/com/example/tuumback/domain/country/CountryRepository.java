package com.example.tuumback.domain.country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CountryRepository extends JpaRepository<Country, Integer> {
    @Query("select c from Country c where c.countryName = ?1")
    Country findByCountryName(String countryName);
}