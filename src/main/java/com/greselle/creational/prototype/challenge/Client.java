package com.greselle.creational.prototype.challenge;

public class Client {

    public static void main(String[] args) {
        BasicCarCache.loadCache();

        BasicCar nano = BasicCarCache.getCar("Nano");
        System.out.println("Car name: " + nano.getName());
        System.out.println("Car price: " + nano.getPrice());

        BasicCar ford = BasicCarCache.getCar("Ford");
        System.out.println("Car name: " + ford.getName());
        System.out.println("Car price: " + ford.getPrice());
    }
}
