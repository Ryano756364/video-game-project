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
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));  //automatically uses toString method of record class
        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean(Address.class));  //can also do this as well
        //so once Spring manages a Bean, you can either use the name or the type of the bean to retrieve it

        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));
    }
}
