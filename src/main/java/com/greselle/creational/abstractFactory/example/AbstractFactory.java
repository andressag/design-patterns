package com.greselle.creational.abstractFactory.example;

public abstract class AbstractFactory {
    abstract Color getColors(String color);
    abstract Shape getShape(String shape);
}

class ShapeFactory extends AbstractFactory {

    @Override
    Color getColors(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}

class ColorFactory extends AbstractFactory {

    @Override
    Color getColors(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
