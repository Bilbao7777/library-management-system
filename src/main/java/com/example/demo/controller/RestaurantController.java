package com.example.demo.controller;

import com.example.demo.model.Restaurant;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/restaurant")
public class RestaurantController {

    @PostMapping("")
    //url http://localhost:8080/restaurant
    public void restaurantDetails(@RequestBody Restaurant restaurant){
        System.out.println("Restaurant name, capacity and address is:");
        System.out.println(restaurant);

        return;
    }

}
