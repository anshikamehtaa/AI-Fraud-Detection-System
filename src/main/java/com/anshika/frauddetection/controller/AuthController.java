package com.anshika.frauddetection.controller;

import com.anshika.frauddetection.dto.RegisterRequestDTO;
import com.anshika.frauddetection.dto.UserResponseDTO;
import com.anshika.frauddetection.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @PostMapping("/register")
    public UserResponseDTO register(@RequestBody RegisterRequestDTO request) {
        return userService.registerUser(request);
    }
}