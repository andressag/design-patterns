package com.greselle.creational.singleton.challenge;

public class CaptainSingleton {

    private String teamName;

    // constructor is defined but never used.
    private CaptainSingleton() {
    }

    private static class SingletonHelper {
        private static final CaptainSingleton createCaptain = new CaptainSingleton();
    }

    public static CaptainSingleton getCaptain() {
        return SingletonHelper.createCaptain;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String assigned) {
        teamName = assigned;
    }
}
