package com.rutik.itemapi.controller;

import com.rutik.itemapi.model.Item;
import com.rutik.itemapi.service.ItemService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final ItemService service;

    public ItemController(ItemService service) {
        this.service = service;
    }

    // Add new item
    @PostMapping("/add")
    public String addItem(@Valid @RequestBody Item item) {
        service.addItem(item);
        return "Item added successfully!";
    }

    // Get all items
    @GetMapping
    public List<Item> getAllItems() {
        return service.getAllItems();
    }

    // Get item by ID
    @GetMapping("/{id}")
    public Item getItemById(@PathVariable int id) {
        return service.getItemById(id);
    }

    // Delete item by ID
    @DeleteMapping("/{id}")
    public String deleteItem(@PathVariable int id) {
        return service.deleteItem(id);
    }
}
