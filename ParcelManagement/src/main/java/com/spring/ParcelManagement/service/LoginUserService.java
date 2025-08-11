package com.spring.ParcelManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.ParcelManagement.model.User;
import com.spring.ParcelManagement.repo.LoginUserRepo;
import com.spring.ParcelManagement.repo.RegisterUserRepo;

@Service
public class LoginUserService {

	LoginUserRepo repo;

    @Autowired
    public LoginUserService(LoginUserRepo repo) {
        this.repo = repo;
    }

    public boolean checkUser(User user) {
        boolean result = repo.login(user);
        if(result) {
            //log.info(user.toString());
            //log.info("User registered successfully");
        }
        return result;
    }
}
