package com.greselle.creational.builder.challenge;

import com.greselle.creational.builder.challenge.product.MealBuilder;

public class Director {

    MealBuilder mealBuilder;

    public void construct(MealBuilder builder) {
        mealBuilder = builder;
        mealBuilder.buildBurger();
        mealBuilder.buildDrink();
    }
}
