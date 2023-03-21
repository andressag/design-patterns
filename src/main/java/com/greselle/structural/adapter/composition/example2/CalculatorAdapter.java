package com.greselle.structural.adapter.composition.example2;

public class CalculatorAdapter implements CalculatorInterface {

    Calculator calculator;
    Triangle triangle;

    public CalculatorAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public double getArea(Rectangle nullRectangle) {
        calculator =  new Calculator();

        // in this case we will never have a rectangle but a triangle that need to be converted
        Rectangle rectangle = new Rectangle();
        rectangle.width = triangle.height * 0.5;
        rectangle.length = triangle.base;
        return calculator.getArea(rectangle);
    }
}
