package com.example.tuumback.domain.account;

import com.example.tuumback.business.login.dto.LoginResponse;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AccountMapper {





    @Mapping(source = "availableAmount", target = "availableAmount")
    LoginResponse toLoginResponse (LoginResponse loginResponse);


}