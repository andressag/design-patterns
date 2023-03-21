package com.greselle.solid.delegation;

class RealPrinter {
    // the delegate

    void print() {
        System.out.println("printing the delegate");
    }
}

class Printer {
    // the delegator

    RealPrinter realPrinter = new RealPrinter();

    // create the delegate
    void print() {
        realPrinter.print(); // delegation
    }
}

class Tester {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();
    }
}