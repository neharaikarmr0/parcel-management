package com.spring.ParcelManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.ParcelManagement.model.User;
import com.spring.ParcelManagement.repo.RegisterUserRepo;

@Service
public class RegisterUserService {

	RegisterUserRepo repo;

    @Autowired
    public RegisterUserService(RegisterUserRepo repo) {
        this.repo = repo;
    }

    public void saveUser(User user) {
        int result = repo.register(user);
        if(result == 1) {
            //log.info(user.toString());
            //log.info("User registered successfully");
        }

    }
}
