package com.example.tuumback.domain.country;

import com.example.tuumback.business.dto.RegistrationRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CountryMapper {

    @Mapping(source = "countryName", target = "countryName")
    Country toCountry(RegistrationRequest registrationRequest);


}