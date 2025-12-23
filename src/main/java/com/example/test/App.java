package com.example.test;


import com.example.test.business.BusinessClassService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class App {
   public static void main(String[] args){
    try(var context = new AnnotationConfigApplicationContext(App.class)) {

      System.out.println(context.getBean(BusinessClassService.class).findMax());
    }

   }
}