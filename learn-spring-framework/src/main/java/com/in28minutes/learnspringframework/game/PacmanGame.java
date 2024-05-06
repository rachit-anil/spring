package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacmanGame implements GamingConsole{
    String gameName="Pakman";

    @Override
    public void up() {
        System.out.println("pack up");
    }

    @Override
    public void down() {
        System.out.println("pac down");
    }

    @Override
    public void left() {
        System.out.println("pac left");
    }

    @Override
    public void right() {
        System.out.println("pak right");
    }
}
