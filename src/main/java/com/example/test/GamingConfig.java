package com.example.test;

import com.example.test.game.GamingConsole;
import com.example.test.game.MarioGame;
import com.example.test.game.GameRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class GamingConfig { 

    @Bean
    public GamingConsole game() {
        var game = new MarioGame();
        return game;
    }


    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}