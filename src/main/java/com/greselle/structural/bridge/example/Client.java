package com.greselle.structural.bridge.example;

public class Client {
    public static void main(String[] args) {

        // Separets abstraction from implementers

        Vehicle vehicle1 = new Car(new Produce(), new Assemble());
        vehicle1.manufacture();

        Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
        vehicle2.manufacture();
    }
}
