package com.ryanpodell.videogameproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age){
    //record is new feature brought about in JDK16 - helps eliminate verbosity of beans - no manual creation of getter, setter, ect...
}

record Address (String firstLine, String city){};

@Configuration
public class HelloWorldConfiguration {
    //In here you can define Spring beans - things that are managed by Spring
    //You can find the methods to manage the beans in the configuration class

    @Bean
    public String name() {
        return "Ryan";
    }

    @Bean
    public int age() {
        return 15;
    }

    @Bean
    public Person person(){
        var person = new Person("Toby", 20);
        return person;
    }

    @Bean
    public Address address(){
        var address = new Address("123 Vine Street", "Columbus");
        return address;
    }
}
