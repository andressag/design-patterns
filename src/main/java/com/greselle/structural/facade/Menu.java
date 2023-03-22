package com.greselle.structural.facade;

public interface Menu {
    void showMenu();
}

class NonVegMenu implements Menu {

    NonVegMenu() {
        System.out.println("Creating a non veg menu");
    }

    @Override
    public void showMenu() {
        System.out.println("Menu items in a Non veg menu");
    }
}

class VegMenu implements Menu {

    VegMenu() {
        System.out.println("Creating a veg menu");
    }


    @Override
    public void showMenu() {
        System.out.println("Menu items in a veg menu");
    }
}

