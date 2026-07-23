package com.example;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] arr = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Phone", "Electronics"),
            new Product(103, "Shoes", "Footwear"),
            new Product(104, "Watch", "Accessories")
        };

        Product p1 = SearchAlgorithms.linearSearch(arr, "Phone");
        if (p1 != null) {
            System.out.println("Linear Search Found: " + p1.getName());
        }

        Arrays.sort(arr, Comparator.comparing(Product::getName));
        Product p2 = SearchAlgorithms.binarySearch(arr, "Phone");
        if (p2 != null) {
            System.out.println("Binary Search Found: " + p2.getName());
        }
    }
}
