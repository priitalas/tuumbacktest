package com.example.tuumback.domain.account;

import com.example.tuumback.business.dto.RegistrationInfo;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AccountMapper {



    @Mapping(source = "id", target = "accountId")
    @Mapping(source = "customer.id", target = "customerId")
    @Mapping(source = "currencies.id", target = "currency")
    @Mapping(source = "availableAmount", target = "availableAmount")
    RegistrationInfo toRegistrationInfo(Account account);
}