package com.greselle.structural.bridge.challenge;

// abstraction
public abstract class Shape {
    protected ColorInterface color;

    protected Shape(ColorInterface color) {
        this.color = color;
    }

    abstract void draw(int border);
    void modifyBorder(int border, int increment) {
        System.out.println("Modify border");
        color.paint(border * increment);
    }
}

class Triangle extends Shape {

    public Triangle(ColorInterface color) {
        super(color);
    }

    @Override
    void draw(int border) {
        System.out.println("Triangle");
        color.paint(border);
    }
}

class Rectangle extends Shape {


    public Rectangle(ColorInterface color) {
        super(color);
    }

    @Override
    void draw(int border) {
        System.out.println("Rectangle");
        color.paint(border);
    }
}
