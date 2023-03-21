package com.greselle.creational.builder.challenge.product;

import com.greselle.creational.builder.challenge.model.MeatBurger;
import com.greselle.creational.builder.challenge.model.Peps;

public class MeatMealBuilder implements MealBuilder {

    private Meal meal = new Meal();

    @Override
    public void buildBurger() {
        meal.addItem(new MeatBurger());
    }

    @Override
    public void buildDrink() {
        meal.addItem(new Peps());
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
