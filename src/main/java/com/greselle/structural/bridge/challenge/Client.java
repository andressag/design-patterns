package com.greselle.structural.bridge.challenge;

public class Client {
    public static void main(String[] args) {

        // Separate abstraction from implementers
        Shape shape1 = new Triangle(new Green());
        shape1.draw(10);
        shape1.modifyBorder(10, 2);

        Shape shape2 = new Rectangle(new Red());
        shape2.draw(20);
        shape2.modifyBorder(20, 2);
    }
}
