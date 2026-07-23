package com.example;

import java.util.Arrays;

public class ECommerceSearchingPlatform {
    public static void main(String[] args) {
        Product[] arr = {
            new Product(105, "Laptop", "Electronics", 10, 800.0),
            new Product(101, "Mouse", "Electronics", 50, 20.0),
            new Product(103, "Keyboard", "Electronics", 30, 50.0)
        };

        Product p1 = SearchAlgorithms.linearSearch(arr, 103);
        if (p1 != null) {
            System.out.println("Linear search found: " + p1.getProductName());
        }

        Arrays.sort(arr);
        Product p2 = SearchAlgorithms.binarySearch(arr, 103);
        if (p2 != null) {
            System.out.println("Binary search found: " + p2.getProductName());
        }
    }
}
