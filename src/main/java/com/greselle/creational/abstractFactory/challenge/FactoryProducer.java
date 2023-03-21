package com.greselle.creational.abstractFactory.challenge;

public class FactoryProducer {
    public static MovieFactoryInterface getFactory(String type) {
        if (type.equalsIgnoreCase("Comedy")) {
            return new ComedyMovieFactory();
        } else if (type.equalsIgnoreCase("Action")) {
            return new ActionMovieFactory();
        }
        return null;
    }
}
