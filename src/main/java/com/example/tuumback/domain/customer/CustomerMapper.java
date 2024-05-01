package com.example.tuumback.domain.customer;

import com.example.tuumback.business.dto.RegistrationRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CustomerMapper {

    @Mapping(source = "customerId", target = "customerId")
    Customer toCustomer(RegistrationRequest registrationRequest);





}