package com.spring.ParcelManagement.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class User {


    @NotBlank(message = "Name must not be blank!")
    @Size(max = 20, message = "Name must be only 20 char long")
    String fullname;

    @NotBlank(message = "Ph no must not be blank!")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "ph no must be 10 digits")
    String sender_mobile;

    @NotBlank(message = "address must not be blank!")
    String sender_addr;

    @Email(message = "valid email")
    @NotBlank(message = "email must not be blank!")
    String sender_mail;

    @NotBlank(message = "username must not be blank!")
    String username;

    @NotBlank(message = "password must not be blank!")
    String password;
    String con_password;
}
