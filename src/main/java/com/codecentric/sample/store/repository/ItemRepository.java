package com.codecentric.sample.store.repository;

import com.codecentric.sample.store.model.Item;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class ItemRepository {


    private static final Map<String, Item> itemMap;
    static
    {
        itemMap = new HashMap<String, Item>();
        itemMap.put("it1", new Item("it1", "Item 1", "This is item 1", 2000, true));
    }

    public List<Item> readAllItems() {
        ArrayList<Item> itemList = new ArrayList<Item>(itemMap.values());
        return itemList;
    }

    public Item findById(String id) {
        return itemMap.get(id);
    }
}
