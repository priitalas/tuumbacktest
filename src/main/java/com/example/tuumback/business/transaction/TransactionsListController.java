package com.example.tuumback.business.transaction;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TransactionsListController {

    private TransactionsListService  transactionsListService;


    @GetMapping("/transactions-list")
    public void getTransactionsList(){
        transactionsListService.getTransactionsList();
    }

}
