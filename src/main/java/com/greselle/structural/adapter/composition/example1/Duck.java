package com.greselle.structural.adapter.composition.example1;

public interface Duck {
    void quack();
    void fly();
}

class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("QuaQua");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }
}
