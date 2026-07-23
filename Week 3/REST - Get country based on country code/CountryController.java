package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable("code") String code) {
        if ("IN".equalsIgnoreCase(code)) {
            return new Country("IN", "India");
        }
        return new Country(code, "Unknown");
    }
}
