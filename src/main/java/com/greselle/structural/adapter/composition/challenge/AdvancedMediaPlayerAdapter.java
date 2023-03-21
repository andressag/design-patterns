package com.greselle.structural.adapter.composition.challenge;

public class AdvancedMediaPlayerAdapter implements MediaPlayerInterface {

    AdvanceMediaPlayerInterface advanceMediaPlayerInterface;

    public AdvancedMediaPlayerAdapter(AdvanceMediaPlayerInterface mediaPlayerInterface) {
        advanceMediaPlayerInterface = mediaPlayerInterface;
    }

    @Override
    public void play(String audioType, String fileName) {
        advanceMediaPlayerInterface.loadFileName(fileName);
        advanceMediaPlayerInterface.listen();
    }
}
