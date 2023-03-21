package com.greselle.creational.singleton.challenge;

public class TestSingleton {

    public static void main(String[] args) {
        CaptainSingleton captainSingleton = CaptainSingleton.getCaptain();

        // set data value
        captainSingleton.setTeamName("Team A");

        System.out.println("First reference: " + captainSingleton);
        System.out.println("Singleton data value is: " + captainSingleton.getTeamName());

        // get another reference to the Singleton
        CaptainSingleton captainSingleton2 = CaptainSingleton.getCaptain();

        System.out.println("First reference: " + captainSingleton2);
        System.out.println("Singleton data value is: " + captainSingleton2.getTeamName());

        if (captainSingleton == captainSingleton2) {
            System.out.println("is the same");
        }
    }
}
