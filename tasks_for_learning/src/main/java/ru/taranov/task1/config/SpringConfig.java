package ru.taranov.task1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.taranov.task1.ClassicMusic;
import ru.taranov.task1.MusicPlayer;
import ru.taranov.task1.RockMusic;

@Configuration
@ComponentScan("ru.taranov.task1")
public class SpringConfig {

    @Bean
    public ClassicMusic classicMusic() {
        return new ClassicMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(rockMusic(), classicMusic());
    }
}
