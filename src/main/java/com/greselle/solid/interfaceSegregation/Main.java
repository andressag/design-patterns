package com.greselle.solid.interfaceSegregation;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

// not a good design
//interface ShapeInterface {
//    double area();
//    double volume();
//}

interface Shape {
    double area();
}

interface SolidShape {
    double volume();
}

interface ManageShape{
    double calculate();
}

class Cube implements Shape, SolidShape, ManageShape {

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }

    @Override
    public double calculate() {
        return this.area() + this.volume();
    }
}

class Square implements Shape, ManageShape {

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double calculate() {
        return this.area();
    }
}

