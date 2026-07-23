package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepo;
    private String name;

    public BookService(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printDetails() {
        System.out.println("Service: " + name);
        bookRepo.save();
    }
}
