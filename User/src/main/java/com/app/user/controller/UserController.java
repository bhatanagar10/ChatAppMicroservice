package com.app.user.controller;

import com.app.user.entity.User;
import com.app.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<String> registerData(@RequestBody User user){
        userService.insert(user);
        return new ResponseEntity<>("Successfully created",HttpStatus.CREATED);
    }

    @GetMapping("/{userID}")
    public ResponseEntity<User> get(@PathVariable Integer userID){
        User user = userService.getData(userID);
        return new ResponseEntity<>(user,HttpStatus.ACCEPTED);
    }
}
