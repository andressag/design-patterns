package PACKAGE_NAME;

public class AreaCalculator {

    public double calculateRectangleArea(Rectangle rectangle) {
        return rectangle.length * rectangle.with;
    }

    public double calculateCircleArea(Circle circle) {
        return (22/7) * circle.radius * circle.radius;
    }

    // in this example every time we need a new shape we also need to modify this class and add a new method.

}

class Rectangle {
    public double length;
    public double with;
}

class Circle {
    public double radius;
}
