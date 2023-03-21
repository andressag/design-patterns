package com.greselle.creational.singleton.billPugh;

// does not require synchronization, is thread-safe and only creates the instance when the client needs it
// most used approach
public class SingletonBillPugh {

    // an instance attribute
    private int data = 0;

    private SingletonBillPugh() {}

    // nested class is a reference after getInstance is called
    // this class is only loaded when the SingletonBillPugh is call what help with performance
    private static class SingletonHelper {
        private static final SingletonBillPugh uniqueInstance =  new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return SingletonHelper.uniqueInstance;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
}
