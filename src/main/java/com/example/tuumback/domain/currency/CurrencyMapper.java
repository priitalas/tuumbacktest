package com.example.tuumback.domain.currency;

import com.example.tuumback.business.registration.dto.RegistrationInfo;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CurrencyMapper {

   @Mapping(source = "currency", target = "currency")
   Currency toCurrency(RegistrationInfo registrationInfo);

}