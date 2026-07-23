package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.Country;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {
    private List<Country> list = new ArrayList<>();

    public CountryController() {
        list.add(new Country("IN", "India"));
        list.add(new Country("US", "United States"));
        list.add(new Country("DE", "Germany"));
    }

    @GetMapping
    public List<Country> getAll() {
        return list;
    }

    @GetMapping("/{code}")
    public Country getByCode(@PathVariable("code") String code) {
        for (Country c : list) {
            if (c.getCode().equalsIgnoreCase(code)) {
                return c;
            }
        }
        return null;
    }

    @PostMapping
    public Country addCountry(@RequestBody Country c) {
        list.add(c);
        return c;
    }
}
