package com.cognizant.account.controller;

import com.cognizant.account.model.Account;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{id}")
    public Account getAccount(@PathVariable int id) {
        return new Account(id, "ACC100" + id, 5000.0);
    }
}
