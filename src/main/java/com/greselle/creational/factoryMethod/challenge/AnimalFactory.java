package com.greselle.creational.factoryMethod.challenge;

public class AnimalFactory {

    public Animal getAnimalType(String animal) {
        if (animal.equalsIgnoreCase("TIGER")) {
            return new Tiger();
        } else if (animal.equalsIgnoreCase("DUCK")) {
            return new Duck();
        }
        return null;
    }
}
