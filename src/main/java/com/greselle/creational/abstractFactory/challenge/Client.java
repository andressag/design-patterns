package com.greselle.creational.abstractFactory.challenge;

public class Client {
    public static void main(String[] args) {
        MovieFactoryInterface actionMovies = FactoryProducer.getFactory("action");

        HollywoodInterface hollywoodActions = actionMovies.getHollywoodMovie();
        BollywoodInterface bollywoodActions = actionMovies.getBollywoodMovie();

        hollywoodActions.getMovieName();
        bollywoodActions.getMovieName();

        MovieFactoryInterface comedyMovies = FactoryProducer.getFactory("comedy");

        HollywoodInterface hollywoodComedy = comedyMovies.getHollywoodMovie();
        BollywoodInterface bollywoodComedy = comedyMovies.getBollywoodMovie();

        hollywoodComedy.getMovieName();
        bollywoodComedy.getMovieName();
    }
}
