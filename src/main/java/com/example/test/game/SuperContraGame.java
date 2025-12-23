package com.example.test.game;

import com.example.test.game.GamingConsole;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;


@Component()
@Qualifier("superContra")
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