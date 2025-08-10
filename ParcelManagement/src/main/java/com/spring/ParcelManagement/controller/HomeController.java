package com.spring.ParcelManagement.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    public Map<String, String> homePage() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Welcome to Parcel Management System");
        response.put("signup_url", "/signup");
        response.put("signin_url", "/signin");
        return response;
    }

    @GetMapping("/signup")
    public Map<String, String> signup() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Signup endpoint - send POST request with user details");
        return response;
    }

    @GetMapping("/signin")
    public Map<String, String> signin() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Signin endpoint - send POST request with credentials");
        return response;
    }
}
