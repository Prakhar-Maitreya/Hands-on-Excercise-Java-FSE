package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/authenticate")
    public String authenticate(@RequestParam String user, @RequestParam String pass) {
        if ("admin".equals(user) && "password".equals(pass)) {
            return jwtUtil.generateToken(user);
        }
        throw new RuntimeException("Invalid credentials");
    }
}
