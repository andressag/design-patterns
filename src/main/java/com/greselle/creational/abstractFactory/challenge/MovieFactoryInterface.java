package com.greselle.creational.abstractFactory.challenge;

public abstract class MovieFactoryInterface {
    abstract HollywoodInterface getHollywoodMovie();
    abstract BollywoodInterface getBollywoodMovie();
}

class ActionMovieFactory extends MovieFactoryInterface {

    @Override
    HollywoodInterface getHollywoodMovie() {
            return new HollywoodInterfaceActionMovie();
    }

    @Override
    BollywoodInterface getBollywoodMovie() {
        return new BollywoodInterfaceActionMovie();
    }
}

class ComedyMovieFactory extends MovieFactoryInterface {


    @Override
    HollywoodInterface getHollywoodMovie() {
        return new HollywoodInterfaceComedyMovie();
    }

    @Override
    BollywoodInterface getBollywoodMovie() {
        return new BollywoodInterfaceComedyMovie();
    }
}


