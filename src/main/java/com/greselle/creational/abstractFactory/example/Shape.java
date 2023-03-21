package com.greselle.creational.abstractFactory.example;

public interface Shape {
    void draw();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle");

    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle");
    }
}
