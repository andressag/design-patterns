package com.greselle.creational.builder.challenge.product;

import com.greselle.creational.builder.challenge.model.Coke;
import com.greselle.creational.builder.challenge.model.VegBurger;

public class VegMealBuilder implements MealBuilder {

    private Meal meal = new Meal();

    @Override
    public void buildBurger() {
        meal.addItem(new VegBurger());
    }

    @Override
    public void buildDrink() {
        meal.addItem(new Coke());
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
