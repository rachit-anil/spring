package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//class GamingConfiguration {
//
//
//}

@Configuration
@ComponentScan("com.in28minutes.learnspringframework.game")
public class GamingApplicationLauncher {
//    @Bean
//    public GamingConsole game() {
//        return new PacmanGame();
//    }

//    @Bean
//    public GameRunner gameRunner(GamingConsole game) {
//        return new GameRunner(game);
//    }

    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(GamingApplicationLauncher.class);
        context.getBean(GameRunner.class).run();
    }
}
