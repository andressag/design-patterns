package com.greselle.creational.prototype;

public class Client {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape: " + clonedShape.getType());
    }
}
