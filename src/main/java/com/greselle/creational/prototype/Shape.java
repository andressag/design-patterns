package com.greselle.creational.prototype;

public abstract class Shape implements Cloneable {
    protected String id;
    protected String type;

    abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return clone;
    }
}

class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }


    @Override
    void draw() {
        System.out.println("Draw Rectangle");
    }
}

class Square extends Shape {
    public Square() {
        type = "Square";
    }


    @Override
    void draw() {
        System.out.println("Draw Square");
    }
}

class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }


    @Override
    void draw() {
        System.out.println("Draw Circle");
    }
}