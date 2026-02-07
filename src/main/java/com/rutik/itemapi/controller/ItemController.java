package com.rutik.itemapi.controller;

import com.rutik.itemapi.model.Item;
import com.rutik.itemapi.service.ItemService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> addItem(@Valid @RequestBody Item item) {
        service.addItem(item);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Item added successfully!");
    }

    // Get all items
    @GetMapping
    public ResponseEntity<List<Item>> getAllItems() {
        return ResponseEntity.ok(service.getAllItems());
    }

    // Get item by ID
    @GetMapping("/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable int id) {
        return ResponseEntity.ok(service.getItemById(id));
    }

    // Update item by id
    @PutMapping("/{id}")
    public ResponseEntity<String> updateItem(
            @PathVariable int id,
            @Valid @RequestBody Item item) {

        service.updateItem(id, item);

        return ResponseEntity.ok("Item updated successfully!");
    }

    // Delete item by id
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteItem(@PathVariable int id) {

        service.deleteItem(id);

        return ResponseEntity.ok("Item deleted successfully!");
    }
}
