package com.example.authentication_service.controller;

import com.example.authentication_service.entity.authentication.LoginRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/auth/")
public interface AuthenticationControllerInterface {
    @PostMapping("login")
    ResponseEntity<String> login(LoginRequest request);
}
