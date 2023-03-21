package com.greselle.creational.builder.example;

import java.util.LinkedList;

public class Product {

    private LinkedList<String> parts;

    public Product() {
        parts = new LinkedList<>();
    }

    public void add(String part) {
        parts.addLast(part);
    }
    public void show() {
        parts.forEach(System.out::println);
    }
}
