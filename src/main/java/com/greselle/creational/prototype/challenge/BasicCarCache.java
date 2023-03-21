package com.greselle.creational.prototype.challenge;

import java.util.Hashtable;

public class BasicCarCache {
    private static Hashtable<String, BasicCar> basicCarHashtable = new Hashtable<>();

    public static BasicCar getCar(String carName) {
        BasicCar cached = basicCarHashtable.get(carName);
        return cached.clone();
    }

    public static void loadCache() {
        BasicCar nano = new Nano();
        nano.price = 10000f;
        basicCarHashtable.put("Nano", nano);

        BasicCar ford = new Ford();
        ford.price = 12000f;
        basicCarHashtable.put("Ford", ford);

    }
}
