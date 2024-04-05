package com.jess.controller;

import com.jess.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/users")
    public User CreateUser(@RequestBody User user)
    {
      return user;
    }
}
