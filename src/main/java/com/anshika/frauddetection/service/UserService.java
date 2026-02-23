package com.anshika.frauddetection.service;

import com.anshika.frauddetection.dto.RegisterRequestDTO;
import com.anshika.frauddetection.dto.UserResponseDTO;

public interface UserService {
    UserResponseDTO registerUser(RegisterRequestDTO request);
}
