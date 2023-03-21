package com.greselle.creational.builder.challenge.product;

import com.greselle.creational.builder.challenge.model.Coke;
import com.greselle.creational.builder.challenge.model.Item;

import java.util.LinkedList;

public class Meal {

    private LinkedList<Item> items;

    public Meal() {
        items = new LinkedList<>();
    }

    public void addItem(Item item) {
        items.addLast(item);
    }

    public float getCost() {
        float cost = 0.0f;

        for (Item item: items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItem() {
        for (Item item: items) {
            System.out.println(item.name());
            System.out.println(item.packing().pack());
            System.out.println(item.price());
        }
    }
}
