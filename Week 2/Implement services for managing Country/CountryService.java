package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repo;

    public List<Country> getAllCountries() {
        return repo.findAll();
    }

    public Country getCountryByCode(String code) {
        return repo.findById(code).orElse(null);
    }

    public Country addCountry(Country c) {
        return repo.save(c);
    }
}
