package com.rutik.itemapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return """
                Welcome to Item Management REST API 🚀

                Available Endpoints:
                - GET    /api/items
                - GET    /api/items/{id}
                - POST   /api/items/add
                - PUT    /api/items/{id}
                - DELETE /api/items/{id}
                """;
    }
}
