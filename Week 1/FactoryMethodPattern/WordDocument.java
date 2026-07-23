package com.example;

public class WordDocument implements Document {
    public void open() {
        System.out.println("Opening word file");
    }

    public void close() {
        System.out.println("Closing word file");
    }
}
