package com.example;

public class SearchAlgorithms {
    public static Product linearSearch(Product[] arr, int targetId) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getProductId() == targetId) {
                return arr[i];
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] arr, int targetId) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid].getProductId() == targetId) {
                return arr[mid];
            }
            if (arr[mid].getProductId() < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
}
