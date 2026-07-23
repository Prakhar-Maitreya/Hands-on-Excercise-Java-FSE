package com.example;

public class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening excel file");
    }

    public void close() {
        System.out.println("Closing excel file");
    }
}
