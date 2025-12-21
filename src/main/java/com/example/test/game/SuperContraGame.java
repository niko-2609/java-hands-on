package com.example.test.game;

import com.example.test.game.GamingConsole;

public class SuperContraGame implements GamingConsole {

    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Crouch");
    }

    public void left() {
        System.out.println("Block");
    }

    public void right() {
        System.out.println("Shoot");
    }
}