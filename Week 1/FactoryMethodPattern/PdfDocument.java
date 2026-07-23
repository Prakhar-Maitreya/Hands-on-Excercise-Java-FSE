package com.example;

public class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening pdf file");
    }

    public void close() {
        System.out.println("Closing pdf file");
    }
}
