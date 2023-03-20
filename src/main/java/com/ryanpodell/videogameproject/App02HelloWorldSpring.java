package com.ryanpodell.videogameproject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //Already have a JVM running
        //So now we want to create a Spring context
        //Want Spring to manage 'name'
        //(1) Launch a Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //(2) Configure things we want Spring to manage - can create a @Configuration class
        //create the name method with the @Bean annotation
        //now we are retrieving Beans managed by Spring
        System.out.println(context.getBean("name"));
    }
}
