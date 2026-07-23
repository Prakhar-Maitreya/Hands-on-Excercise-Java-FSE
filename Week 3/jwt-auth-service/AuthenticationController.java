package com.cognizant.jwt.controller;

import com.cognizant.jwt.model.JwtResponse;
import com.cognizant.jwt.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/authenticate")
    public JwtResponse createToken(@RequestParam String username, @RequestParam String password) {
        if ("user".equals(username) && "pwd".equals(password)) {
            String tok = jwtUtil.generateToken(username);
            return new JwtResponse(tok);
        }
        throw new RuntimeException("Invalid credentials");
    }
}
