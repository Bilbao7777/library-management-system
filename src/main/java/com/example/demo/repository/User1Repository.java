package com.example.demo.repository;

import com.example.demo.model.User1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User1Repository extends JpaRepository<User1, Long> {


    public User1 findUser1ByUsernameAndPassword(String username, String password);
}
