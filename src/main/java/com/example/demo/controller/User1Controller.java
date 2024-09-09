package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.model.User1;
import com.example.demo.service.User1Service;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping ("/user1")
public class User1Controller {

    private final User1Service user1Service;
    // Dependency Injection using Constructor

    public User1Controller(User1Service user1Service){
        this.user1Service = user1Service;
    }

    //Insert User  like students and Librarian accounts in Database

    @PostMapping
    public ResponseEntity<String> save (@RequestBody User1 user1){
        return ResponseEntity.ok(this.user1Service.save(user1));
    }

    //validating librarian and students

    @PostMapping("login")
    public ResponseEntity<User1> validate (@RequestBody User1 user1){
        System.err.println("Validating the user.......");
        return ResponseEntity.ok (this.user1Service.validate(user1));
    }




}
