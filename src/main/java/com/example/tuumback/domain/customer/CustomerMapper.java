package com.example.tuumback.domain.customer;

import com.example.tuumback.business.dto.RegistrationInfo;
import com.example.tuumback.business.dto.RegistrationRequest;
import com.example.tuumback.domain.account.Account;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CustomerMapper {


    @Mapping(source = "personalId", target = "personalId")
    Customer toCustomer(RegistrationRequest registrationRequest);

    @Mapping(source = "id", target = "customerId")
    RegistrationInfo toRegistrationInfo(Customer customer);



}