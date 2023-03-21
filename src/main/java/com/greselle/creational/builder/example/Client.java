package com.greselle.creational.builder.example;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        BuilderInterface carbuilder = new Car();
        BuilderInterface motobuilder = new MotorCycle();

        director.construct(carbuilder);
        Product product1 = carbuilder.getVehicle();
        product1.show();

        director.construct(motobuilder);
        Product product2 = motobuilder.getVehicle();
        product2.show();
    }
}
