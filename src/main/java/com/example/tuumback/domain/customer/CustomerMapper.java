package com.example.tuumback.domain.customer;

import com.example.tuumback.business.registration.dto.RegistrationRequest;
import com.example.tuumback.business.registration.dto.RegistrationInfo;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CustomerMapper {

    @Mapping(source = "personalId", target = "personalId")
    Customer toCustomer(RegistrationInfo registrationInfo);

    @Mapping(source = "id", target = "customerId")
    RegistrationRequest toRegistrationInfo(Customer customer);

}