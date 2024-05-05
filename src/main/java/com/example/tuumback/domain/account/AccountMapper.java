package com.example.tuumback.domain.account;

import com.example.tuumback.business.login.dto.LoginResponse;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AccountMapper {

    @Mapping(source = "availableAmount", target = "availableAmount")
    @Mapping(source = "currencies.currency", target = "currency")
    @Mapping(source = "customer.id", target = "customerId")
    @Mapping(source = "id", target = "accountId")
    LoginResponse toLoginResponse (Account account);

}