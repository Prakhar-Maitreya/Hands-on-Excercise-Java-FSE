package com.example;

public class FactoryMethodTest {
    public static void main(String[] args) {
        DocumentFactory f1 = new WordDocumentFactory();
        Document d1 = f1.createDocument();
        d1.open();
        d1.close();

        DocumentFactory f2 = new PdfDocumentFactory();
        Document d2 = f2.createDocument();
        d2.open();
        d2.close();

        DocumentFactory f3 = new ExcelDocumentFactory();
        Document d3 = f3.createDocument();
        d3.open();
        d3.close();
    }
}
