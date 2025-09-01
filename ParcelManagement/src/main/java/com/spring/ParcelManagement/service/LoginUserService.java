package com.spring.ParcelManagement.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.spring.ParcelManagement.model.Users;
import com.spring.ParcelManagement.repo.LoginUserRepo;
import com.spring.ParcelManagement.repo.RegisterUserRepo;

@Service
public class LoginUserService {

	LoginUserRepo repo;

    @Autowired
    public LoginUserService(LoginUserRepo repo) {
        this.repo = repo;
    }

    public boolean checkUser(Users user) {
        boolean result = repo.login(user);
        if(result) {
            //log.info(user.toString());
            //log.info("User registered successfully");
        }
        return result;
    }
}



//import org.springframework.stereotype.Service;
//
//import com.spring.ParcelManagement.model.Users;
//import com.spring.ParcelManagement.repo.LoginUserRepository;
//
//@Service
//public class LoginUserService {
//
//	private final LoginUserRepository repo;
//	
//	@Autowired
//	public LoginUserService(LoginUserRepository repo) {
//		this.repo = repo;
//	}
//
//	public String checkUser(String sender_mail, String password) {
//		Users u = repo.findByEmail(sender_mail);
//		//System.out.println(u.getEmail() + " & "+u.getPassword());
//		if(u!=null) {
//			if(u.getPassword().equals(password)) {
//				return "Login Successful!";
//			}else {
//				return "Incorrect Password";
//			}
//			
//		}else {
//			return "Email does not exist!";
//		}
//		
//		
//	}
//
//}
