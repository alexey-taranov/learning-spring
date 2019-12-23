package ru.taranov.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    private ClassicMusic classicMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicMusic classicMusic, RockMusic rockMusic) {
        this.classicMusic = classicMusic;
        this.rockMusic = rockMusic;
    }
//    private Music music1;
//    private Music music2;
//
//    @Autowired
//    public MusicPlayer(
//            @Qualifier("classicMusic") Music music1,
//            @Qualifier("rockMusic") Music music2) {
//        this.music1 = music1;
//        this.music2 = music2;
//    }

    public void playMusic(MusicGenre mg) {
        Random random = new Random();
        int rand = random.nextInt(3);
        if (mg == MusicGenre.CLASSICAL) {
            System.out.println(classicMusic.getSong().get(rand));
        } else {
            System.out.println(rockMusic.getSong().get(rand));
        }
    }
}
