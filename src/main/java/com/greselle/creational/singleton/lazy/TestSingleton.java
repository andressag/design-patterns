package com.greselle.creational.singleton.lazy;

public class TestSingleton {

    public static void main(String[] args) {
        SingletonLazy s = SingletonLazy.getInstance();

        // set data value
        s.setData(22);

        System.out.println("First reference: " + s);
        System.out.println("Singleton data value is: " + s.getData());

        // get another reference to the Singleton
        s = null;
        s = SingletonLazy.getInstance();

        System.out.println("First reference: " + s);
        System.out.println("Singleton data value is: " + s.getData());
    }
}
