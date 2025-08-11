package com.spring.ParcelManagement.repo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.ParcelManagement.model.User;

@Repository
public class LoginUserRepo {

	private final JdbcTemplate jdbcTemplate;

    public LoginUserRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public boolean login(User user) {
    	String sql = "SELECT COUNT(*) FROM users WHERE username = ? AND password = ?";
        
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class, user.getUsername(), user.getPassword());
        
        // If count is greater than 0, user exists
        return count != null && count > 0;
    }
}
