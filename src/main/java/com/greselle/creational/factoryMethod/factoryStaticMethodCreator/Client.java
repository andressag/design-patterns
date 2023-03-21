package com.greselle.creational.factoryMethod.factoryStaticMethodCreator;

public class Client {

    public static void main(String[] args) {

        Shape shape = ShapeFactory.getShape("CIRCLE");
        shape.draw();

        Shape shape1 = ShapeFactory.getShape("SQUARE");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("RECTANGLE");
        shape2.draw();
    }
}
