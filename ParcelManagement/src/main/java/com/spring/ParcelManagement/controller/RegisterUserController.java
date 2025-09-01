package com.spring.ParcelManagement.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.ParcelManagement.model.Users;
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
    public String registerUser(@RequestBody Users u) {
        String response = service.saveUser(u);
        
        return response;
    }
}



//package com.spring.registerAndLogin.controller;

//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.spring.ParcelManagement.model.UserRegister;
//import com.spring.ParcelManagement.model.Users;
//import com.spring.ParcelManagement.service.RegisterUserService;
//
//import lombok.extern.slf4j.Slf4j;
//
//@RestController
//@Slf4j
//public class RegisterUserController {
//	
//	private final RegisterUserService service;
//	
//	public RegisterUserController(RegisterUserService service) {
//		this.service = service;
//		
//	}
//	@PostMapping("/registerUser")
//	@ResponseBody
//	public String registerUser(@RequestBody Users u) {
//		//System.out.println(u.getFullname());
//		String result = service.register(u);
//		return result;
//		
//	}
//	
//
//}
