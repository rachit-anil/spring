package com.in28minutes.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraQualifier")
public class SuperContra implements  GamingConsole {
    public void up(){
        System.out.println("Go super up");
    }
    public void down(){
        System.out.println("Go super down");
    }
    public void left(){
        System.out.println("GO super left");
    }
    public void right(){
        System.out.println("Go super right");
    }
}
