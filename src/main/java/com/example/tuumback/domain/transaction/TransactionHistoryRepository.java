package com.example.tuumback.domain.transaction;

import com.example.tuumback.business.transaction.dto.TransactionHistoryInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TransactionHistoryRepository extends JpaRepository<TransactionHistory, Integer> {


    @Query("select t from TransactionHistory t where t.account.id = :accountId")
    List<TransactionHistoryInfo> getTransactionListBy(Integer accountId);
}