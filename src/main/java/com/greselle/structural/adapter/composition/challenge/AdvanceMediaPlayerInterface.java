package com.greselle.structural.adapter.composition.challenge;

public interface AdvanceMediaPlayerInterface {
    void loadFileName(String fileName);
    void listen();
}

class VlcPlayer implements AdvanceMediaPlayerInterface {

    String file;

    @Override
    public void loadFileName(String fileName) {
        file = fileName;
    }

    @Override
    public void listen() {
        System.out.println("Playing vlc file. Name: " + file);
    }
}

class Mp4Player implements AdvanceMediaPlayerInterface {

    String file;

    @Override
    public void loadFileName(String fileName) {
        file = fileName;
    }

    @Override
    public void listen() {
        System.out.println("Playing Mp4Player file. Name: " + file);
    }
}
