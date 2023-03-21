package com.greselle.creational.builder.example;

public interface BuilderInterface {
    void buildBody();
    void insertWheels();
    void addHeadLights();
    Product getVehicle();
}

class Car implements BuilderInterface {

    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("build car body");
    }

    @Override
    public void insertWheels() {
        product.add("4 wheels are added to car");
    }

    @Override
    public void addHeadLights() {
        product.add("2 lights are added to car");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}

class MotorCycle implements BuilderInterface {


    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("build motorcycle body");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are added to motorcycle");
    }

    @Override
    public void addHeadLights() {
        product.add("1 lights are added to motorcycle");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
