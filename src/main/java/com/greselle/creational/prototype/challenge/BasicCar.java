package com.greselle.creational.prototype.challenge;

public abstract class BasicCar implements Cloneable {
    protected String name;
    protected Float price;

    public String getName() {
        return name;
    }

    public Float getPrice() {
        return price;
    }


    public BasicCar clone()  {
        try {
            return (BasicCar) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
