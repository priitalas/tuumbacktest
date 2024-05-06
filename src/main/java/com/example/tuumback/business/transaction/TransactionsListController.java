package com.example.tuumback.business.transaction;

import com.example.tuumback.business.transaction.dto.TransactionHistoryInfo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TransactionsListController {

    private TransactionsListService  transactionsListService;
    @GetMapping("/transactions-list")
    public List<TransactionHistoryInfo> getTransactionsList(@RequestParam Integer accountId){
        return transactionsListService.getTransactionsList(accountId);
    }

}
