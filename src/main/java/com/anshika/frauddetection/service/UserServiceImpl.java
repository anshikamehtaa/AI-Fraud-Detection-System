package com.anshika.frauddetection.service;

import com.anshika.frauddetection.dto.RegisterRequestDTO;
import com.anshika.frauddetection.dto.UserResponseDTO;
import com.anshika.frauddetection.entity.Role;
import com.anshika.frauddetection.entity.UserEntity;
import com.anshika.frauddetection.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserResponseDTO registerUser(RegisterRequestDTO request) {
      String encodedPassword=passwordEncoder.encode(request.getPassword());
        UserEntity user = UserEntity.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(encodedPassword)
                .role(Role.USER)   // default role
                .build();

        UserEntity savedUser = userRepository.save(user);

        return UserResponseDTO.builder()
                .id(savedUser.getId())
                .name(savedUser.getName())
                .email(savedUser.getEmail())
                .role(savedUser.getRole().name())
                .build();


    }


}
