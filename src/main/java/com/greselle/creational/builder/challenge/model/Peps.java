package com.greselle.creational.builder.challenge.model;

public class Peps extends Drink {

    public Peps() {
    }

    @Override
    public String name() {
        return "Peps";
    }

    @Override
    public float price() {
        return 1f;
    }
}
