package com.bengonohugues.auth_service.dto;

import lombok.Data;

@Data
public class AuthResponseDto {

    private String accessToken;

    public void setAccessToken(String token) {
    }
}