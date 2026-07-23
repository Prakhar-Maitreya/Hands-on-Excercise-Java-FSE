package com.example;

public class InventoryTest {
    public static void main(String[] args) {
        InventoryManagement inv = new InventoryManagement();
        inv.addProduct(new Product(1, "Pen", 100, 1.5));
        inv.addProduct(new Product(2, "Notebook", 50, 4.0));
        inv.updateProduct(1, 120, 1.8);
        Product p = inv.getProduct(1);
        if (p != null) {
            System.out.println(p.getName() + " " + p.getQty());
        }
        inv.deleteProduct(2);
    }
}
