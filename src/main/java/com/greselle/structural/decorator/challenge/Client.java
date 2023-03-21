package com.greselle.structural.decorator.challenge;

public class Client {
    public static void main(String[] args) {
        // obj without any decorator
        Shape circle = new Circle();
        circle.draw();
        System.out.println("------------");
        // obs with decorator
        Shape redCircle = new RedShape(new Circle());
        redCircle.draw();

        System.out.println("------------");
        Shape redRectangle = new RedShape(new Rectangle());
        redRectangle.draw();

    }
}
