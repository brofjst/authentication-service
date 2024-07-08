package com.example.authentication_service.controller;

import com.example.authentication_service.entity.authentication.LoginRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController implements AuthenticationControllerInterface {
    public ResponseEntity<String> login(@RequestBody LoginRequest request) {
        return new ResponseEntity<>("asd", HttpStatus.OK);
    }
}
