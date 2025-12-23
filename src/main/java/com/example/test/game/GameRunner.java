package com.example.test.game;

import com.example.test.game.GamingConsole;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;


@Component
public class GameRunner {
    
    private GamingConsole game;

    public GameRunner(@Qualifier("mario") GamingConsole game) {
        this.game = game;
    }


    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.right();
        game.left();
    }
}