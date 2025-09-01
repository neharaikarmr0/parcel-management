package com.spring.ParcelManagement.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data 
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // primary key

    @NotBlank(message = "Name must not be blank!")
    @Size(max = 20, message = "Name must be only 20 char long")
    @Column(name = "fullname", nullable = false, length = 20)
    private String fullname;

    @NotBlank(message = "Ph no must not be blank!")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "ph no must be 10 digits")
    @Column(name = "sender_mobile", nullable = false, length = 10)
    private String sender_mobile;

    @NotBlank(message = "address must not be blank!")
    @Column(name = "sender_addr", nullable = false)
    private String sender_addr;

    @Email(message = "valid email")
    @NotBlank(message = "email must not be blank!")
    @Column(name = "sender_mail", nullable = false)
    private String sender_mail;

    @NotBlank(message = "username must not be blank!")
    @Column(name = "username", nullable = false)
    private String username;

    @NotBlank(message = "password must not be blank!")
    @Column(name = "password", nullable = false)
    private String password;

    @Transient // not stored in DB
    private String con_password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getSender_mobile() {
		return sender_mobile;
	}

	public void setSender_mobile(String sender_mobile) {
		this.sender_mobile = sender_mobile;
	}

	public String getSender_addr() {
		return sender_addr;
	}

	public void setSender_addr(String sender_addr) {
		this.sender_addr = sender_addr;
	}

	public String getSender_mail() {
		return sender_mail;
	}

	public void setSender_mail(String sender_mail) {
		this.sender_mail = sender_mail;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCon_password() {
		return con_password;
	}

	public void setCon_password(String con_password) {
		this.con_password = con_password;
	}
}



