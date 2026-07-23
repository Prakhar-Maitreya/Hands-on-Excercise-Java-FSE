package com.example;

import java.util.HashMap;
import java.util.Map;

public class InventoryManagement {
    private Map<Integer, Product> map = new HashMap<>();

    public void addProduct(Product p) {
        map.put(p.getId(), p);
    }

    public void updateProduct(int id, int qty, double price) {
        if (map.containsKey(id)) {
            Product p = map.get(id);
            p.setQty(qty);
            p.setPrice(price);
        }
    }

    public void deleteProduct(int id) {
        map.remove(id);
    }

    public Product getProduct(int id) {
        return map.get(id);
    }
}
