package com.spring.ParcelManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.ParcelManagement.model.Users;
import com.spring.ParcelManagement.service.LoginUserService;
import com.spring.ParcelManagement.service.RegisterUserService;

@Controller
public class LoginUserController {
	private LoginUserService service;

    @Autowired
    public LoginUserController(LoginUserService service) {
        this.service = service;
    }

    @GetMapping("/loginUser")
    @ResponseBody
    public String loginUser(@RequestBody Users u) {
        boolean userLogin = service.checkUser(u);
        if(userLogin) {
           return "User Login successful";
        }
		return "Username or password invalid";
        
    }

}



//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.spring.ParcelManagement.service.LoginUserService;
//
//@RestController
//public class LoginUserController {
//
//	private LoginUserService service;
//	
//	    @Autowired
//	    public LoginUserController(LoginUserService service) {
//	        this.service = service;
//	    }
//	
//	
//	@GetMapping("/loginUser/{email}/{password}")
//	public String loginUser(@PathVariable String sender_mail, @PathVariable String password) {
//		//System.out.println("email - "+email+ " password - "+password);
//		String result = service.checkUser(sender_mail,password);
//		return result;
//		
//	}
//}
