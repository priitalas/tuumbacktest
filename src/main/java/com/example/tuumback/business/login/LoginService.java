package com.example.tuumback.business.login;


import com.example.tuumback.business.login.dto.LoginResponse;
import com.example.tuumback.domain.account.Account;
import com.example.tuumback.domain.account.AccountMapper;
import com.example.tuumback.domain.account.AccountRepository;
import com.example.tuumback.infrastructure.validation.ValidationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class LoginService {

    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;

    public LoginResponse login(Integer accountId) {
        Optional<Account> optionalAccount = accountRepository.findAccountBy(accountId);
        Account account = ValidationService.getValidexistingAccount(optionalAccount);
        return accountMapper.toLoginResponse(account);
    }
}
