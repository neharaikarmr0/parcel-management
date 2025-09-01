package com.spring.ParcelManagement.repo;


import com.spring.ParcelManagement.model.Users;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RegisterUserRepo {

    private final JdbcTemplate jdbcTemplate;

    public RegisterUserRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public boolean existsByEmail(String email) {
        String sql = "SELECT COUNT(*) FROM users WHERE sender_mail = ?";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class, email);
        return count != null && count > 0;
    }
    
    public String register(Users user) {
    	if (existsByEmail(user.getSender_mail())) {
            return "Email already registered!";
        }
        String sql = "insert into users(fullname, sender_mobile,sender_addr,sender_mail,username,password) " +
                "values(?,?,?,?,?,?)"; 
        		int res = jdbcTemplate.update(sql, user.getFullname(),user.getSender_mobile(),user.getSender_addr(),
                user.getSender_mail(),user.getUsername(), user.getPassword());
        		if(res==1) {
        			return "User Registration successful!";
        		}
				return "User Registration unsuccessful!";
    }
}
