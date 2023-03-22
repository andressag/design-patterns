package com.greselle.structural.flyweight.example;

public interface RobotInterface {
    void print();

    // extrinsic data is passed as arguments
    void setColor(String color);
}

class Robot implements RobotInterface {

    private String type;
    private String color;

    public Robot(String robotType) {
        this.type = robotType;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("Print() -> Robot type: " + type + " and color: " + color);
    }

}