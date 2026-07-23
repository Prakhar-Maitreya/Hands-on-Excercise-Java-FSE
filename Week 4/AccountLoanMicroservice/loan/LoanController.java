package com.cognizant.loan.controller;

import com.cognizant.loan.model.Loan;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @GetMapping("/{id}")
    public Loan getLoan(@PathVariable int id) {
        return new Loan(id, "LN500" + id, 25000.0);
    }
}
