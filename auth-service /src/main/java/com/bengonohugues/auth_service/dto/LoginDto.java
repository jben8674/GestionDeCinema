package com.bengonohugues.auth_service.dto;

import lombok.Data;

@Data
public class LoginDto {

    private String username;
    private String password;

    public Object getUsername() {
        return username;
    }

    public Object getPassword() {
        return password;
    }
}