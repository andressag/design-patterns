package com.greselle.creational.factoryMethod.factoryAbstractCreator;

public abstract class AbstractShapeFactory {
    protected abstract Shape factoryMethod();

    public Shape getShape() {
        return factoryMethod();
    }
}

class RectangleFactory extends AbstractShapeFactory {
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}


class SquareFactory extends AbstractShapeFactory {
    protected Shape factoryMethod() {
        return new Square();
    }
}


class CircleFactory extends AbstractShapeFactory {
    protected Shape factoryMethod() {
        return new Circle();
    }
}