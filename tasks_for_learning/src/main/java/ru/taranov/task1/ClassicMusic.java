package ru.taranov.task1;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicMusic implements Music {

    private List<String> classicSongs = new ArrayList<>();

    {
        classicSongs.add("Hungarian Rhapsody");
        classicSongs.add("Symphony no. 5 in C Minor, op. 67");
        classicSongs.add("Night on Bald Mountain");
    }

    @Override
    public List<String> getSong() {
        return classicSongs;
    }
}
