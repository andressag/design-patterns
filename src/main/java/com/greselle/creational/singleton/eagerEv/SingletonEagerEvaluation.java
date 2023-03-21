package com.greselle.creational.singleton.eagerEv;

public class SingletonEagerEvaluation {

    // create an instance of singleton in a static initializer, to make thread safe
    private static SingletonEagerEvaluation uniqueInstance = new SingletonEagerEvaluation();

    // an instance attribute
    private int data = 0;

    private SingletonEagerEvaluation() {}

    public static SingletonEagerEvaluation getInstance() {
        return uniqueInstance;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
}
