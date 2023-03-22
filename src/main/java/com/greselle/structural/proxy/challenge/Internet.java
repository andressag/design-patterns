package com.greselle.structural.proxy.challenge;

public interface Internet {
    void connectTo(String serverHost) throws Exception;
}

class RealInternet implements Internet {

    @Override
    public void connectTo(String serverHost) throws Exception {
        System.out.println("Connection to server: " + serverHost);
    }
}
