package com.greselle.creational.abstractFactory.challenge;

public interface HollywoodInterface {
    String getMovieName();
}

class HollywoodInterfaceActionMovie implements HollywoodInterface {

    @Override
    public String getMovieName() {
        System.out.println("Hollywood Action Movie");
        return "HollywoodActionMovie";
    }
}

class HollywoodInterfaceComedyMovie implements HollywoodInterface {

    @Override
    public String getMovieName() {
        System.out.println("Hollywood Comedy Movie");
        return "HollywoodComedyMovie";
    }
}
