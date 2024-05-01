package com.example.tuumback.domain.currency;

import com.example.tuumback.business.dto.RegistrationRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CurrencyMapper {

   // @Mapping(source = "currencies", target = "currency")
    //Currency toCurrency(RegistrationRequest registrationRequest);


}