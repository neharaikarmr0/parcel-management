package com.spring.ParcelManagement.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.ParcelManagement.model.User;
import com.spring.ParcelManagement.service.RegisterUserService;

@Controller
public class RegisterUserController {
	
	private RegisterUserService service;

    @Autowired
    public RegisterUserController(RegisterUserService service) {
        this.service = service;
    }

    @PostMapping("/registerUser")
    @ResponseBody
    public Map<String, String> registerUser(@RequestBody User u) {
        service.saveUser(u);
        Map<String, String> response = new HashMap<>();
        response.put("message", "User Registration successful");
        return response;
    }
}

