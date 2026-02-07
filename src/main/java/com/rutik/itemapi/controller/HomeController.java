package com.rutik.itemapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return """
                <html>
                <head>
                    <title>Item Management API</title>
                </head>
                <body style="font-family: Arial; padding: 20px;">

                    <h1 style="color: #2c3e50;">
                        Welcome to Item Management REST API 🚀
                    </h1>

                    <h2>Available Endpoints:</h2>

                    <ul style="font-size: 18px;">
                        <li><b>GET</b> /api/items</li>
                        <li><b>GET</b> /api/items/{id}</li>
                        <li><b>POST</b> /api/items/add</li>
                        <li><b>PUT</b> /api/items/{id}</li>
                        <li><b>DELETE</b> /api/items/{id}</li>
                    </ul>

                    <p style="margin-top: 20px; color: gray;">
                        Developed by Rutik Yadav
                    </p>

                </body>
                </html>
                """;
    }
}
