package com.example.test;

import com.example.test.GamingConfig;
import com.example.test.game.GamingConsole;
import com.example.test.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AppGamingBasic01 {
   public static void main(String[] args){
     // 1. Launch spring context 
    try(var context = new AnnotationConfigApplicationContext(GamingConfig.class)) {
    // 2. Configure things spring has to manage for us.
    // This is done in the HelloWorldConfiguration 

    // 3. Retrieve Beans managed by Spring
    context.getBean(GameRunner.class).run();
    }

   }
}