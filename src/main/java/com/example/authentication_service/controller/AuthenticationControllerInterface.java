package com.example.authentication_service.controller;

import com.example.authentication_service.entity.authentication.LoginRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth/")
public interface AuthenticationControllerInterface {
    @PostMapping("login")
    String login(LoginRequest request);
}
