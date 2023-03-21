package com.greselle.creational.abstractFactory.example;

public class Client {

    public static void main(String[] args) {

        // has a relationship

        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.draw();
        //..//

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color = colorFactory.getColors("RED");
        color.fill();
    }
}
