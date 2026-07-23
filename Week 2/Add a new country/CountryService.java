package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repo;

    @Transactional
    public Country saveCountry(Country c) {
        return repo.save(c);
    }
}
