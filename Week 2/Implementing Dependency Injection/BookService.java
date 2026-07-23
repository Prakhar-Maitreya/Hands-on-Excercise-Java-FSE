package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepo;

    public void setBookRepo(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    public String getBook(int id) {
        return bookRepo.findBook(id);
    }
}
