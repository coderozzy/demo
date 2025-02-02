package com.example.demo.controller;

import com.example.demo.model.UserData;
import com.example.demo.service.UserDataService;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/userdata")
public class UserDataController {

    @Autowired
    private UserDataService userDataService;

    @PostMapping("/create")
    public UserData createUserData(@Valid @RequestBody UserData userData, @AuthenticationPrincipal User user) {
        userData.setUser(user);
        return userDataService.saveUserData(userData);
    }
}
