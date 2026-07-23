package com.cognizant.orderservice.controller;

import com.cognizant.orderservice.dto.UserDTO;
import com.cognizant.orderservice.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private WebClient webClient;

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable int id) {
        Order o = new Order(id, 1, "Laptop", 1200.0);
        UserDTO u = webClient.get()
                .uri("http://localhost:8081/users/" + o.getUserId())
                .retrieve()
                .bodyToMono(UserDTO.class)
                .block();
        return o;
    }
}
