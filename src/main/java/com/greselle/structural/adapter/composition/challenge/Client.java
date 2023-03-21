package com.greselle.structural.adapter.composition.challenge;

public class Client {
    public static void main(String[] args) {
        MediaPlayerInterface audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "rihanna.mp3");

        // this is not supported
        audioPlayer.play("vlc", "someone.vlc");

        // using the adapter to be able to play
        AdvanceMediaPlayerInterface mp4player = new Mp4Player();
        MediaPlayerInterface adapter = new AdvancedMediaPlayerAdapter(mp4player);
        adapter.play("mp4", "alone.mp4");

        AdvanceMediaPlayerInterface vlcPlayer = new VlcPlayer();
        MediaPlayerInterface adapter2 = new AdvancedMediaPlayerAdapter(vlcPlayer);
        adapter2.play("vlc", "someone.vlc");

    }
}
