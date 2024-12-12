package com.example.java_pandas.liblary.controller;

import com.example.java_pandas.demostudentman.dto.LoginRequest;
import com.example.java_pandas.demostudentman.dto.RegisterRequest;
import com.example.java_pandas.demostudentman.service.UserAuthService;
import com.example.java_pandas.liblary.dto.LibrarianDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("auth")
@RequiredArgsConstructor
public class UserAuthController {
    private final UserAuthService userService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LibrarianDto user) {
        return userService.loginUser(user);
    }
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody LibrarianDto user) {
        return userService.registerUser(user);
    }
    @PostMapping("/skip")
    public ResponseEntity<String> skip(){
        LibrarianDto user = new LibrarianDto();
        user.setUsername(UUID.randomUUID().toString());
        user.setPassword(UUID.randomUUID().toString());
        return userService.registerUser(user);
    }
}
