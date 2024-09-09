package com.example.demo.config;

import com.example.demo.model.Address;
import com.example.demo.model.Project;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {

    @Bean
    @Profile("prod")// here you can add the name of the active profile. We can use it to run @bean only for the certain
    //profile.
    public Address onlineShopping (){
        System.out.println("Inside Bean Creation");

        return Address.builder()
                .city("Paris")
                .street("Notre Dame")
                .zipcode("5828")
                .build();
    }
}
