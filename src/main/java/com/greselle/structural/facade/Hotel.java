package com.greselle.structural.facade;

public interface Hotel {
    Menu getMenus();
}

class NonVegRestaurant implements Hotel {
    public Menu getMenus() {
        return new NonVegMenu();
    }
}

class VegRestaurant implements Hotel {
    public Menu getMenus() {
        return new VegMenu();
    }
}
