package com.greselle.creational.abstractFactory.challenge;

public interface BollywoodInterface {
    String getMovieName();
}

class BollywoodInterfaceActionMovie implements BollywoodInterface {

    @Override
    public String getMovieName() {
        System.out.println("Bollywood Action Movie");
        return "BollywoodActionMovie";
    }
}

class BollywoodInterfaceComedyMovie implements BollywoodInterface {

    @Override
    public String getMovieName() {
        System.out.println("Bollywood Comedy Movie");
        return "BollywoodComedyMovie";
    }
}
