package com.greselle.structural.proxy.challenge;

public class Client {

    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("something.com");
            internet.connectTo("hello.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
