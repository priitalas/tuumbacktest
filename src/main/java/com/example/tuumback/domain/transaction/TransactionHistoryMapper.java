package com.example.tuumback.domain.transaction;

import com.example.tuumback.business.transaction.dto.TransactionHistoryInfo;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface TransactionHistoryMapper {


    @Mapping(source = "id", target = "transactionId")
    @Mapping(source = "account.id", target = "accountId")
   // @Mapping(source = "account.currencies", target = "accountCurrency")
   // @Mapping(source = "transactionDirection", target = "transactionDirection")
    @Mapping(source = "transactionAmount", target = "transactionAmount")
    TransactionHistoryInfo toTransactionHistoryInfo(TransactionHistory transactionHistory);
    List<TransactionHistoryInfo> toTransactionHistoryInfos(List<TransactionHistoryInfo> transactionHistoryInfos);


}