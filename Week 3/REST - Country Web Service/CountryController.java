package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {

    @GetMapping
    public Country getCountry() {
        return new Country("IN", "India");
    }

    @GetMapping("/all")
    public List<Country> getAllCountries() {
        List<Country> list = new ArrayList<>();
        list.add(new Country("IN", "India"));
        list.add(new Country("US", "United States"));
        return list;
    }
}
