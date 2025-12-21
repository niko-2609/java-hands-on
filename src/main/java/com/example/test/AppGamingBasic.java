package com.example.test;

import com.example.test.game.MarioGame;
import com.example.test.game.SuperContraGame;
import com.example.test.game.GameRunner;

// Class - Defines objects and methods
public class AppGamingBasic {

    // method in the class, is callable using the object
    public static void main(String[] args) {
        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}