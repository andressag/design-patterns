package com.greselle.creational.builder.challenge.model;

public class MeatBurger extends Burger {

    public MeatBurger() {
    }

    @Override
    public String name() {
        return "MeatBurger";
    }

    @Override
    public float price() {
        return 14f;
    }
}
