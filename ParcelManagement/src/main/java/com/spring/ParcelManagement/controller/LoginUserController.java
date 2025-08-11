package com.spring.ParcelManagement.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.ParcelManagement.model.User;
import com.spring.ParcelManagement.service.LoginUserService;
import com.spring.ParcelManagement.service.RegisterUserService;

@Controller
public class LoginUserController {
	private LoginUserService service;

    @Autowired
    public LoginUserController(LoginUserService service) {
        this.service = service;
    }

    @PostMapping("/loginUser")
    @ResponseBody
    public Map<String, String> loginUser(@RequestBody User u) {
        boolean userLogin = service.checkUser(u);
        if(userLogin) {
        	Map<String, String> response = new HashMap<>();
            response.put("message", "User Login successful");
            return response;
        }
		return null;
        
    }

}
