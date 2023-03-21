package com.greselle.creational.singleton.synchronize;

import com.greselle.creational.singleton.lazy.SingletonLazy;

public class TestSingleton {

    public static void main(String[] args) {
        SingletonSynchronize s = SingletonSynchronize.getInstance();

        // set data value
        s.setData(55);

        System.out.println("First reference: " + s);
        System.out.println("Singleton data value is: " + s.getData());

        // get another reference to the Singleton
        s = null;
        s = SingletonSynchronize.getInstance();

        System.out.println("First reference: " + s);
        System.out.println("Singleton data value is: " + s.getData());
    }
}
