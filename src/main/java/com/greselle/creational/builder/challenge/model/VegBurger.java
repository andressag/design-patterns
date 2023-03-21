package com.greselle.creational.builder.challenge.model;

public class VegBurger extends Burger {

    public VegBurger() {
    }

    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 10f;
    }

}
