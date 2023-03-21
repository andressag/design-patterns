package com.greselle.creational.factoryMethod.challenge;

public interface Animal {

    void whoIsIt();
}

class Tiger implements Animal {

    @Override
    public void whoIsIt() {
        System.out.println("I'm a Tiger!");
    }
}

class Duck implements Animal {

    @Override
    public void whoIsIt() {
        System.out.println("I'm a Duck");
    }
}
