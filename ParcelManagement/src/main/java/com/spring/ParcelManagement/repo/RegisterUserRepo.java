package com.spring.ParcelManagement.repo;


import com.spring.ParcelManagement.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RegisterUserRepo {

    private final JdbcTemplate jdbcTemplate;

    public RegisterUserRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int register(User user) {
        String sql = "insert into users(fullname, sender_mobile,sender_addr,sender_mail,username,password) " +
                "values(?,?,?,?,?,?)";
        return jdbcTemplate.update(sql, user.getFullname(),user.getSender_mobile(),user.getSender_addr(),
                user.getSender_mail(),user.getUsername(),user.getPassword());
    }
}
