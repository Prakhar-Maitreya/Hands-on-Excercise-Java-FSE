package com.example;

public class SearchAlgorithms {
    public static Product linearSearch(Product[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().equalsIgnoreCase(target)) {
                return arr[i];
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] arr, String target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int res = target.compareToIgnoreCase(arr[mid].getName());
            if (res == 0) {
                return arr[mid];
            }
            if (res > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
}
