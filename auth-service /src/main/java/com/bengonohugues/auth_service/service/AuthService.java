package com.bengonohugues.auth_service.service;



import com.bengonohugues.auth_service.dto.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}
