package com.greselle.structural.bridge.challenge;

//  Bridge Implementer interface
public interface  ColorInterface {
    void paint(int border);
}

class Red implements ColorInterface {

    @Override
    public void paint(int border) {
        System.out.println("Red color with" + border + " inch border");
    }
}

class Green implements ColorInterface {

    @Override
    public void paint(int border) {
        System.out.println("Green color with" + border + " inch border");
    }
}
