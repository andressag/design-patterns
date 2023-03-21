package com.greselle.structural.adapter.composition.example2;

public interface CalculatorInterface {
    double getArea(Rectangle rectangle);
}

class Calculator implements CalculatorInterface {

    Rectangle rectangle;

    @Override
    public double getArea(Rectangle rectangle) {
        this.rectangle = rectangle;
        return rectangle.length * rectangle.width;
    }
}