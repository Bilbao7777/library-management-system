package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class FirstCollector {
    //http:localhost:8080/first/hello
  @GetMapping("/hello")
    public String sayHello(){
      return "hello, beautiful world!";
  }


}
