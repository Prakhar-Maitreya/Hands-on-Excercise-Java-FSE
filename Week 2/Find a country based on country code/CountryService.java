package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repo;

    public Country findCountry(String code) {
        return repo.findByCode(code);
    }
}
