package com.example.demo.service;

import com.example.demo.model.User1;
import com.example.demo.repository.User1Repository;
import org.springframework.stereotype.Service;

@Service
public class User1Service {
    private final User1Repository user1Repository;
    public User1Service (User1Repository user1Repository){
        this.user1Repository = user1Repository;
    }

    public String save(User1 user1) {
        User1 save = this.user1Repository.save(user1);
        return "success";

    }

    public User1 validate(User1 user1) {
        User1 validate = this.user1Repository.findUser1ByUsernameAndPassword(user1.getUsername(), user1.getPassword());
        if (validate != null){
            return validate;

        }return user1;
    }
}
