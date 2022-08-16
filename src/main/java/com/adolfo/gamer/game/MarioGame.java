package com.adolfo.gamer.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {

    @Override
    public void up(){
        System.out.println("jump");
    }
    @Override
    public void down(){
        System.out.println("go hole");
    }
    @Override
    public void left(){
        System.out.println("stop");
    }
    @Override
    public void right(){
        System.out.println("faster");
    }
}
