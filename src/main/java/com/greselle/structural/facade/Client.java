package com.greselle.structural.facade;

public class Client {
    public static void main(String[] args) {
        HotelKeeper keeper = new HotelKeeper();

        VegMenu vegMenu = keeper.getVegMenu();
        vegMenu.showMenu();
        NonVegMenu nonVegMenu = keeper.getNonVegMenu();
        nonVegMenu.showMenu();
    }
}
