package com.example.tuumback.business.login;


import com.example.tuumback.business.login.dto.LoginResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class LoginController {

    private LoginService loginService;

    @GetMapping("/login")
    public LoginResponse login (@RequestParam Integer accountId){
       return loginService.login(accountId);
    }

}
