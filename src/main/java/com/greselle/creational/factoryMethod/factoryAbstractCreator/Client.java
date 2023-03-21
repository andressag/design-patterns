package com.greselle.creational.factoryMethod.factoryAbstractCreator;

public class Client {

    public static void main(String[] args) {
        Shape shape = new CircleFactory().getShape();
        shape.draw();

        Shape shape1 = new RectangleFactory().getShape();
        shape1.draw();

        Shape shape2 = new SquareFactory().getShape();
        shape2.draw();
    }
}
