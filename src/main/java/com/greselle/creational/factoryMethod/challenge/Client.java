package com.greselle.creational.factoryMethod.challenge;

public class Client {

    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal animal1 = animalFactory.getAnimalType("TIGER");
        animal1.whoIsIt();

        Animal animal2 = animalFactory.getAnimalType("DUCK");
        animal2.whoIsIt();
    }
}
