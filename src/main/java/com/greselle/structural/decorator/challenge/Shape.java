package com.greselle.structural.decorator.challenge;

// abstract component
public interface Shape {
    void draw();
}

// concrete component
class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}

// concrete component
class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
