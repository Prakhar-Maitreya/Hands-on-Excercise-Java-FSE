package com.cognizant.userservice.controller;

import com.cognizant.userservice.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        return new User(id, "User" + id, "user" + id + "@example.com");
    }
}
