package com.greselle.creational.singleton.lazy;

public class SingletonLazy {

    // the private reference to the one and only instance
    private static SingletonLazy uniqueInstance = null;

    // an instance attribute
    private int data = 0;

    private SingletonLazy() {}


    // this is not thread-safe
    public static SingletonLazy getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonLazy();
        }
        return uniqueInstance;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
}
