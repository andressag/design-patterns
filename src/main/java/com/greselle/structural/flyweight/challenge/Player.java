package com.greselle.structural.flyweight.challenge;

public interface Player {
    // extrinsic data
    void assignWeapon(String weapon);

    void mission();
}

class Terrorist implements Player {
    // instrinsic
    private final String TASK;

    // extrinsic
    private String weapon;

    public Terrorist() {
        TASK = "Plant a bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist with weapon: " + weapon + " task is:" + TASK);
    }
}

class CounterTerrorist implements Player {
    // instrinsic
    private final String TASK;

    // extrinsic
    private String weapon;

    public CounterTerrorist() {
        TASK = "Diffuse a bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("CounterTerrorist with weapon: " + weapon + " task is:" + TASK);
    }
}