package com.rutik.itemapi.repository;

import com.rutik.itemapi.model.Item;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ItemRepository {

    private List<Item> items = new ArrayList<>();

    private int currentId = 1; //Auto Increment Counter

    // Add item with auto ID
    public Item addItem(Item item) {

        item.setId(currentId++);
        items.add(item);

        return item;
    }

    // Get all items
    public List<Item> getAllItems() {
        return items;
    }

    // Get item by ID
    public Item getItemById(int id) {
        return items.stream()
                .filter(item -> item.getId() != null && item.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // Delete item by ID
    public boolean deleteItem(int id) {
        return items.removeIf(item -> item.getId() == id);
    }
}
