package com.example.demo.service;

import com.example.demo.model.UserData;
import com.example.demo.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDataService {

    @Autowired
    private UserDataRepository userDataRepository;

    public UserData saveUserData(UserData userData) {
        return userDataRepository.save(userData);
    }
}
