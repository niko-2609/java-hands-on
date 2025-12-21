package com.example.test;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;



record Address(String firstLine, String city) { };

// Make this class a configuration class, where all the beans can be
// defined and these will be managed by Spring.
@Configuration
public class HelloWorldConfiguration {


    // This will produce a bean that will be managed by the spring container
    @Bean
    public String name() {
        return "Rishabh";
    }

    @Bean(name="address2")
    public Address address() {
        return new Address("Baker Street", "London");
    }

}