package com.greselle.structural.decorator.example1;

public class Client {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecorator1 concreteDecorator1 = new ConcreteDecorator1();

        // Decorating concreteComponent with Decorator1
        concreteDecorator1.setTheComponent(concreteComponent);
        concreteDecorator1.doJob();

        System.out.println("---------------------");
        ConcreteDecorator2 concreteDecorator2 = new ConcreteDecorator2();

        // Decorating concreteComponent with Decorator1 and Decorator2
        concreteDecorator2.setTheComponent(concreteDecorator1); // adding results from Decorator1
        concreteDecorator2.doJob();
    }
}
