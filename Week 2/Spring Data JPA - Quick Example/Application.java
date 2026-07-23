package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner init(CountryRepository repo) {
        return args -> {
            repo.save(new Country("IN", "India"));
            repo.save(new Country("US", "United States"));
            repo.findAll().forEach(c -> System.out.println(c.getName()));
        };
    }
}
