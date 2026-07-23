package com.example;

public class SingletonTest {
    public static void main(String[] args) {
        Logger a = Logger.getInstance();
        Logger b = Logger.getInstance();
        a.log("Singleton testing");
        if (a == b) {
            System.out.println("Same instance");
        } else {
            System.out.println("Different instances");
        }
    }
}
