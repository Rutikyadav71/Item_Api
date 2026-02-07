package com.rutik.itemapi.service;

import com.rutik.itemapi.exception.InvalidRequestException;
import com.rutik.itemapi.exception.ItemNotFoundException;
import com.rutik.itemapi.model.Item;
import com.rutik.itemapi.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private final ItemRepository repo;

    public ItemService(ItemRepository repo) {
        this.repo = repo;
    }

    // Add item
    public Item addItem(Item item) {

        if (item.getId() != null) {
            throw new InvalidRequestException(
                    "ID must not be provided. It is auto-generated."
            );
        }

        return repo.addItem(item);
    }

    // Get all items
    public List<Item> getAllItems() {
        return repo.getAllItems();
    }

    // Get item by ID
    public Item getItemById(int id) {

        Item item = repo.getItemById(id);

        if (item == null) {
            throw new ItemNotFoundException("Item not found with ID: " + id);
        }

        return item;
    }

    // Update item
    public Item updateItem(int id, Item item) {

        if (item.getId() != null) {
            throw new InvalidRequestException(
                    "ID must not be provided in request body. Use path variable."
            );
        }

        Item updatedItem = repo.updateItem(id, item);

        if (updatedItem == null) {
            throw new ItemNotFoundException("Item not found with ID: " + id);
        }

        return updatedItem;
    }

    // Delete item
    public void deleteItem(int id) {

        boolean deleted = repo.deleteItem(id);

        if (!deleted) {
            throw new ItemNotFoundException(
                    "Cannot delete. Item not found with ID: " + id
            );
        }
    }
}
