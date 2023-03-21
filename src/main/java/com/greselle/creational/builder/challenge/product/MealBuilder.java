package com.greselle.creational.builder.challenge.product;

public interface MealBuilder {
    void buildBurger();
    void buildDrink();
    Meal getMeal();
}
