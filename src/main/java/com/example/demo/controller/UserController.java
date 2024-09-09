package com.example.demo.controller;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping  ("/sms/api/v1/users")

public class UserController {


    private  final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }


    @PostMapping
    public ResponseEntity<String> saveUser (@RequestBody User user){
        return ResponseEntity.ok(this.userService.saveUser(user));
    }

    @PostMapping("/login")
    public ResponseEntity<User> checkValidUser (@RequestBody User user) {
        System.err.println("Checking valid user.....");
        return ResponseEntity.ok(this.userService.checkValidUser(user));
    }
}
