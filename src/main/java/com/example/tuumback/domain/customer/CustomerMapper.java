package com.example.tuumback.domain.customer;

import com.example.tuumback.business.dto.RegistrationRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CustomerMapper {
    Customer toEntity(RegistrationRequest registrationRequest);

    RegistrationRequest toDto(Customer customer);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Customer partialUpdate(RegistrationRequest registrationRequest, @MappingTarget Customer customer);
}