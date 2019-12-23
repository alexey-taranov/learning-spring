package ru.taranov.task1;

public class ClassicMusic implements Music {

    private ClassicMusic() {
    }

    public static ClassicMusic getClassicMusic() {
        return new ClassicMusic();
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
