package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService (UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public String saveUser (User user){
        User savedUser = this.userRepository.save(user);
        return "success";
    }

    public User checkValidUser(User user) {
        User validatedUser = this.userRepository.findUserByUsernameAndPassword (user.getUsername(), user.getPassword());
        if(validatedUser != null) {
            return validatedUser;
        }
        return user;
    }
}



