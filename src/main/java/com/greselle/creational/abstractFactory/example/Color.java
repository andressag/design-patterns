package com.greselle.creational.abstractFactory.example;

public interface Color {
    void fill();
}

class Red implements Color {

    @Override
    public void fill() {
        System.out.println("red");
    }
}

class Green implements Color {

    @Override
    public void fill() {
        System.out.println("green");
    }
}

class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("blue");
    }
}