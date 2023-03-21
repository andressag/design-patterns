package com.greselle.creational.builder.challenge.model;

public class Coke extends Drink {

    public Coke() {
    }

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 2f;
    }
}
