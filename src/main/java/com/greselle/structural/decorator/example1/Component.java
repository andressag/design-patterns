package com.greselle.structural.decorator.example1;

public abstract class Component {
    public abstract void doJob();
}

class ConcreteComponent extends Component {

    @Override
    public void doJob() {
        System.out.println("ConcreteComponent - close for modification");
    }
}