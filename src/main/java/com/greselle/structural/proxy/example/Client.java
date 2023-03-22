package com.greselle.structural.proxy.example;

public class Client {

    public static void main(String[] args) {
        Image image = new ProxyImage("testFile.txt");

        image.display();
        System.out.println("------");
        image.display();
    }
}
