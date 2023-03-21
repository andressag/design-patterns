package com.greselle.creational.singleton.synchronize;

public class SingletonSynchronize {

    // the private reference to the one and only instance
    private static SingletonSynchronize uniqueInstance = null;

    // an instance attribute
    private int data = 0;

    private SingletonSynchronize() {}

    // synchronized keyword enforce that is thread-safe
    // can cause bottleneck
    public synchronized static SingletonSynchronize getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonSynchronize();
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
