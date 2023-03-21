package com.greselle.creational.singleton.doubleCheck;

public class SingletonDoubleCheck {

    // the private reference to the one and only instance
    private volatile static SingletonDoubleCheck uniqueInstance = null;

    // an instance attribute
    private int data = 0;

    private SingletonDoubleCheck() {}

    public static SingletonDoubleCheck getInstance() {
        if (uniqueInstance == null) {
            // only synchronize the first time through
            synchronized (SingletonDoubleCheck.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonDoubleCheck();
                }
            }
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
