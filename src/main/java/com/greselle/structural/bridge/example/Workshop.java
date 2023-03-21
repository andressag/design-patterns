package com.greselle.structural.bridge.example;

public abstract class Workshop {
    abstract void work();
}

class Produce extends Workshop {

    @Override
    void work() {
        System.out.println("Produced");
    }
}


class Assemble extends Workshop {

    @Override
    void work() {
        System.out.println("Assembled");
    }
}