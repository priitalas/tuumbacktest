package com.example.tuumback.business.transaction;


import com.example.tuumback.business.transaction.dto.TransactionHistoryInfo;
import com.example.tuumback.domain.transaction.TransactionHistory;
import com.example.tuumback.domain.transaction.TransactionHistoryMapper;
import com.example.tuumback.domain.transaction.TransactionHistoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TransactionsListService {
    private final TransactionHistoryRepository transactionHistoryRepository;
    private final TransactionHistoryMapper transactionHistoryMapper;


    public List<TransactionHistoryInfo> getTransactionsList(Integer accountId) {
       List<TransactionHistoryInfo> transactionHistoryInfos = transactionHistoryRepository.getTransactionListBy(accountId);
            return transactionHistoryMapper.toTransactionHistoryInfos(transactionHistoryInfos);
    }
}




