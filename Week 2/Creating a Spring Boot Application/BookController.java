package com.library.controller;

import com.library.entity.Book;
import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepo;

    @GetMapping
    public List<Book> getAll() {
        return bookRepo.findAll();
    }

    @PostMapping
    public Book add(@RequestBody Book b) {
        return bookRepo.save(b);
    }
}
