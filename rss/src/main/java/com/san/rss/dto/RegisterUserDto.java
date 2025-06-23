package com.san.rss.dto;

import com.san.rss.model.Role;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class RegisterUserDto {
    private String username;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Role role;
    private LocalDateTime createdAt = LocalDateTime.now();
}