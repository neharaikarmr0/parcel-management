package com.spring.ParcelManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.ParcelManagement.model.Users;
import com.spring.ParcelManagement.repo.RegisterUserRepo;

@Service
public class RegisterUserService {

	RegisterUserRepo repo;

    @Autowired
    public RegisterUserService(RegisterUserRepo repo) {
        this.repo = repo;
    }

    public String saveUser(Users user) {
        String result = repo.register(user);
		return result;

    }
}



//import org.springframework.stereotype.Service;
//
//import com.spring.ParcelManagement.model.Users;
////import com.spring.ParcelManagement.repo.RegisterUserRepo;
//import com.spring.ParcelManagement.repo.RegisterUserRepository;

//@Service
//public class RegisterUserService {
//
//	private final RegisterUserRepository repo;
//
//	public RegisterUserService(RegisterUserRepository repo) {
//		this.repo = repo;
//	}
//
//	public String register(Users u) {
//	
//
//		if(repo.findByEmail(u.getSender_mail())==null && repo.findByPhoneNo(u.getSender_mobile())==null){
//			if(repo.save(u)!=null) {
//				return "User registered successfully!";
//			}else {
//				return "User is not registered!";
//			}
//		}else {
//			return "Email and Phone No must be unique";
//		}
//	}
//
//}