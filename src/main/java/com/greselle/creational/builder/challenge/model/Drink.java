package com.greselle.creational.builder.challenge.model;

public abstract class Drink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
