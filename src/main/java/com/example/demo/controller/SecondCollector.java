package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/second")
public class SecondCollector {
//you can call it endpoint , API
//using request parameter
    //http://localhost:8080/second/hi?name=Rajeep&age=25
    @GetMapping("/hi")
    public String greetGuest(@RequestParam(value = "name")String name, @RequestParam(value = "age")int age){
        return "hello, world! " + "from " + name +" and your age is: " +age;
    }


//second way to do the above request using path variable.
/*@RestController
@RequestMapping ("/second")
public class SecondCollector {
    //http://localhost:8080/second/hi/Rajeep
    @GetMapping("/hi/{name}")
    public String greetGuest(@PathVariable("name")String name){
        return "hello, world! " + "from " + name;
    }*/
//taking multiple path variable using @PathVariable.

/*@RestController
@RequestMapping ("/second")
public class SecondCollector {
    //http://localhost:8080/second/hi/ram/23
    @GetMapping("/hi/{name}/{age}/{hair}")
    public String greetGuest2(@PathVariable("name")String name, @PathVariable ("age") int age,
                              @PathVariable("hair") String hair){
        return "Your name is:" + name +  "\n and you age is: " + age + " and  your hair is: "+hair;
    }*/
}