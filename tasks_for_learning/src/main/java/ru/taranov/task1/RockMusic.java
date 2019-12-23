package ru.taranov.task1;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

    void doInit() {
        System.out.println("init rock");
    }

    void doDestroy() {
        System.out.println("destroy rock");
    }
}
