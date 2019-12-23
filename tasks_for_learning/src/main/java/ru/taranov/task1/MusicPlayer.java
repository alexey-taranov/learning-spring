package ru.taranov.task1;

import org.springframework.beans.factory.annotation.Qualifier;

public class MusicPlayer {

    private Music music1;
    private Music music2;

    public MusicPlayer(
            @Qualifier("classicMusic") Music music1,
            @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
        return "Playing: " + music1.getSong() + ", " + music2.getSong();
    }
}
