package com.greselle.creational.builder.challenge;

import com.greselle.creational.builder.challenge.product.Meal;
import com.greselle.creational.builder.challenge.product.MealBuilder;
import com.greselle.creational.builder.challenge.product.MeatMealBuilder;
import com.greselle.creational.builder.challenge.product.VegMealBuilder;

public class Client {
    public static void main(String[] args) {

        Director director = new Director();

        MealBuilder vegMealBuilder = new VegMealBuilder();
        MealBuilder meatMeal = new MeatMealBuilder();

        director.construct(vegMealBuilder);
        Meal vegMeal = vegMealBuilder.getMeal();
        vegMeal.showItem();
        System.out.println(vegMeal.getCost());

    }
}
