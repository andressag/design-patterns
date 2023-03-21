package com.greselle.structural.adapter.composition.example1;

public class Client {

    public static void main(String[] args) {
        MallardDuck duck =  new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("Turkey says:" );
        turkey.gobble();

        System.out.println("Duck says:");
        duck.quack();

        System.out.println("Turkey adapter says:");
        turkeyAdapter.quack();
    }
}
