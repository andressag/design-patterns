package com.greselle.creational.builder.example;

public class Director {

    BuilderInterface builder;

    public void construct(BuilderInterface builder) {
        this.builder = builder;
        this.builder.addHeadLights();
        this.builder.insertWheels();
        this.builder.buildBody();
        this.builder.getVehicle();
    }

}
