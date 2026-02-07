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
                    <title>Item Management REST API</title>
                </head>
                <body style="font-family: Arial; padding: 25px; background-color: #f8f9fa;">

                    <h1 style="color: #2c3e50;">
                        Item Management REST API 🚀
                    </h1>

                    <p style="font-size: 18px; color: #333;">
                        This is a simple Java backend RESTful API application built using Spring Boot.
                        The purpose of this project is to manage a collection of items (ecommerce-style)
                        with in-memory storage and basic CRUD operations.
                    </p>

                    <h2 style="margin-top: 25px;">Available API Endpoints:</h2>

                    <ul style="font-size: 17px; line-height: 1.8;">
                        <li><b>GET</b> /api/items → Get all items</li>
                        <li><b>GET</b> /api/items/{id} → Get item by ID</li>
                        <li><b>POST</b> /api/items/add → Add a new item</li>
                        <li><b>PUT</b> /api/items/{id} → Update an existing item</li>
                        <li><b>DELETE</b> /api/items/{id} → Delete item by ID</li>
                    </ul>

                    <h2 style="margin-top: 25px;">How to Test This API:</h2>

                    <p style="font-size: 16px; color: #444;">
                        ✅ You can test <b>GET</b> endpoints directly in the browser.<br>
                        Example: <a href="/api/items">/api/items</a>
                    </p>

                    <p style="font-size: 16px; color: #444;">
                        ⚡ To test <b>POST</b>, <b>PUT</b>, and <b>DELETE</b> requests, use tools like:
                    </p>

                    <ul style="font-size: 16px;">
                        <li>Postman</li>
                        <li>cURL command line</li>
                        <li>REST Client extensions</li>
                    </ul>

                    <p style="margin-top: 30px; font-size: 14px; color: gray;">
                        Developed by <b>Rutik Yadav</b> | Java Developer | Spring Boot
                    </p>

                </body>
                </html>
                """;
    }
}
